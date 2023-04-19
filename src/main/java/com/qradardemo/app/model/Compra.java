package com.qradardemo.app.model;
import java.time.LocalDateTime;
//import java.util.List;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name="compras")
@Getter @Setter @NoArgsConstructor
public class Compra {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="id_compra")
	private Integer idCompra;
    
    // @Column(name="fid_cliente")
    // private Integer idCliente;

    @Column(name = "fecha")
    private  LocalDateTime fecha;

    @Column(name="medio_pago")
    private String medioPago;

    @Column(name="comentario")
    private String comentario;
    @Column(name="estado")
    private Integer estado;

    @ManyToOne
    @JoinColumn(name="fid_cliente",insertable=false,updatable=false)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Cliente cliente;

    @OneToMany(mappedBy = "compra",cascade = CascadeType.ALL)
    private List<ComprasProducto> productos;
}
