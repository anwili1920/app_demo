package com.qradardemo.app.model;
//import java.util.List;

import javax.persistence.*;
import lombok.*;
@Entity
@Table(name="usuarios")
@Getter @Setter @NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Integer id;

    @Column(name="fid_cliente")
    private Integer idPersona;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password; 
    
    @Column(name="activo")
    private Boolean activo; 

    // @OneToMany(mappedBy="usuario")
    // private List<Compra> tarjetas;

}
