package com.qradardemo.app.model; 

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    
    @JsonBackReference
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fid_compra")
    private Compra compra;
    
    @JsonBackReference
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fid_producto")
    private Producto producto;
}
