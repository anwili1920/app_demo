package com.qradardemo.app.model; 

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="compras_productos")
@Getter @Setter @NoArgsConstructor
public class ComprasProducto {
    // @EmbeddedId
    // private ComprasproductoPK id;
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="id_compras_producto")
	private Integer idComprasProducto; 
    @Column(name="cantidad")
    private Integer cantidad;
    @Column(name="total")
    private Double total;
    @Column(name="estado")
    private Integer estado;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fid_compra")
    private Compra compra;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fid_producto")
    private Producto producto;
}
