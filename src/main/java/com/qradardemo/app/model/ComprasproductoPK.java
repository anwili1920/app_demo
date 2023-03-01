package com.qradardemo.app.model;
import java.io.Serializable;

import javax.persistence.*;
@Embeddable
public class ComprasproductoPK  implements Serializable {
    @Column(name="fid_compra")
    private Integer idCompra;
    @Column(name="fid_producto")
    private Integer idProducto;
}
