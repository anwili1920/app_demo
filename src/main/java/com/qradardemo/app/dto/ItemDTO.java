package com.qradardemo.app.dto;

import com.qradardemo.app.model.*;

import lombok.*;


@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class ItemDTO {
    private String codigoBarras;
    private String nombre;
    private Integer cantidad;
}
