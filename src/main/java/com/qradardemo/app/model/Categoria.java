package com.qradardemo.app.model;
import javax.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Table(name="categorias")
@Getter @Setter @NoArgsConstructor
public class Categoria {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="id_categoria")
	private Integer idCategoria;

    @Column(name ="descripcion")
    private String descripcion;
    
    @Column(name ="estado")
    private Integer estado;

    @OneToMany(mappedBy="categoria")
    private List<Producto> productos;
}
