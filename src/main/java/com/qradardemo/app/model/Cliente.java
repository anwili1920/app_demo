package com.qradardemo.app.model;
//import java.util.List;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name="clientes")
@Getter @Setter @NoArgsConstructor
public class Cliente {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="id_cliente")
	private Integer idCliente; 

    @Column(name ="dni")
    private Integer dni;
    @Column(name ="nombre1")
    private String nombre1;
    @Column(name ="nombre2")
    private String nombre2;
    @Column(name ="apellido1")
    private String apellido1;
    @Column(name ="apellido2")
    private String apellido2;
    @Column(name ="celular")
    private Integer celular;
    @Column(name ="direccion")
    private String direccion;

    // private Usuario usuario;

    @OneToMany(mappedBy="cliente")
    private List<Compra> compras;

}
