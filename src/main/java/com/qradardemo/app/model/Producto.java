package com.qradardemo.app.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="productos")
@Getter @Setter @NoArgsConstructor
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="id_producto")
	private Integer idProducto;
	@Column(name ="nombre")
	private String nombre;
	
	@Column(name="codigo_barras")
	private String codigoBarras;
	
	@Column(name="precio_venta")
	private Double precioVenta;
	
	@Column(name="cantidad_stock")
	private Integer cantidadStock;
	
	@Column(name="estado")
	private Integer estado;

	@ManyToOne
	@JoinColumn(name="fid_categoria",insertable=false, updatable=false)
	private Categoria categoria;
}
