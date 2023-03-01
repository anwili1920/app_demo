package com.qradardemo.app.model; 

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name="compras_productos")
@Getter @Setter @NoArgsConstructor
public class ComprasProducto {
    // @EmbeddedId
    // private ComprasproductoPK id;
    @Column(name="cantidad")
    private Integer cantidad;
    @Column(name="total")
    private Double total;
    @Column(name="estado")
    private Integer estado;

    // @ManyToOne
    // @JoinColumn(name="fid_compra", insertable=false,updatable=false)
    // private Compra compra;
    // @ManyToOne
    // @JoinColumn(name="fid_producto",insertable=false,updatable=false)
    // private Producto producto;
}
