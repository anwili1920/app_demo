package com.qradardemo.app.respository;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import com.qradardemo.app.dao.CreateUserDAO;
import com.qradardemo.app.dto.CreateInputDTO;
import com.qradardemo.app.model.Cliente;
import com.qradardemo.app.model.Usuario;
import com.qradardemo.app.utils.Hasher;
import java.util.List;
import java.util.ArrayList;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class CreateUserImpl implements CreateUserDAO {
    
    private JdbcTemplate template;
    private Hasher hasher; 
    @Override
    public String crearUsuario(CreateInputDTO newUser) {
        Cliente clienteaux= newUser.getCliente();
        Usuario usuarioaux= newUser.getUsuario();
        String QUERY,mensaje="";
        Integer id;
        String contra;
        
        //return jdbcTemplate.update("INSERT INTO tbl_employees (name, location, department) VALUES (?, ?, ?)", new Object[] {e.getName(), e.getLocation(), e.getDepartment()});
        try {
            if( noexisteCliente(clienteaux)&&noexisteUsuario(usuarioaux)){
                QUERY="INSERT INTO BASE_DATOS.CLIENTES(dni,nombre1,nombre2,apellido1,apellido2,celular,direccion) VALUES (?,?,?,?,?,?,?)";
                template.update(QUERY, new Object[] {clienteaux.getDni(),clienteaux.getNombre1(),clienteaux.getNombre2(),clienteaux.getApellido1(),clienteaux.getApellido2(),clienteaux.getCelular(),clienteaux.getDireccion()}); 
            }
            if(noexisteUsuario(usuarioaux)){
                id= usuarioId(clienteaux);
                QUERY="INSERT INTO BASE_DATOS.USUARIOS(fid_cliente,email,password) VALUES (?,?,?)";
                contra=hasher.hash(usuarioaux.getPassword());
                template.update(QUERY, new Object[] {id,usuarioaux.getEmail(),contra}); 
                mensaje="Se logró crear el usuario correctamente";
            }
            else{
                mensaje="El usuario que intenta crear ya se encuentra registrado";
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("-----------------------------------------------");
			System.out.println("Hubo un fallo en la creación de un nuevo usuario");
			System.out.println("-----------------------------------------------");
        }
        return mensaje;
    }
    public Integer usuarioId(Cliente c){
        String QUERY="SELECT id_cliente FROM BASE_DATOS.CLIENTES WHERE dni="+c.getDni();
        return template.queryForObject(QUERY,Integer.class);
    }
    public Boolean noexisteCliente(Cliente c){
        Boolean existencia;
        List<Cliente> listado= new ArrayList<Cliente>();
        String query="SELECT dni FROM BASE_DATOS.CLIENTES";
        listado= template.query(query,new BeanPropertyRowMapper<Cliente>(Cliente.class));
        existencia=true;
        for(Cliente x: listado){
            if(x.getDni().equals( c.getDni())){
                existencia=false;
            }
        }
        return existencia;
    }
    public Boolean noexisteUsuario(Usuario u){
        Boolean existencia;
        List<Usuario> listado= new ArrayList<Usuario>();
        String query="SELECT email FROM BASE_DATOS.USUARIOS";
        listado= template.query(query,new BeanPropertyRowMapper<Usuario>(Usuario.class));
        existencia=true;
        for(Usuario x: listado){
            if(x.getEmail().equals(u.getEmail())){
                existencia=false;
            }
        }
        return existencia;
    }
    
}
