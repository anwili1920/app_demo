package com.qradardemo.app.model;  

import javax.persistence.*;
import lombok.*;
@Entity
@Table(name="tarjetas")
@Getter @Setter @NoArgsConstructor
public class Tarjeta {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name ="id_tarjeta")
	private Integer idTarjeta; 
    @Column(name ="nombre_tarjeta")
    private String nombreTarjeta;
    @Column(name ="fecha_vencimiento")
    private String fechaVencimiento;
    @Column(name ="numero_tarjeta")
    private String numeroTarjeta; 
    
    // @ManyToOne
    // @JoinColumn(name="fid_usuario",insertable=false,updatable=false)
    // private Usuario usuario;

}
