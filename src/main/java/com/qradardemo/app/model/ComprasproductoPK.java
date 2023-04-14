package com.qradardemo.app.model;
import java.io.Serializable;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ComprasproductoPK  implements Serializable {
    @Column(name="fid_compra")
    private Integer idCompra;
    @Column(name="fid_producto")
    private Integer idProducto;
}
