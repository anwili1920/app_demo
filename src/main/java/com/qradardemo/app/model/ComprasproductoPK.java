package com.qradardemo.app.model;
import java.io.Serializable;

import jakarta.persistence.*;
@Embeddable
public class ComprasproductoPK  implements Serializable {
    @Column(name="fid_compra")
    private Integer idCompra;
    @Column(name="fid_producto")
    private Integer idProducto;
}
