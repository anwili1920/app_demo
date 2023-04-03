package com.qradardemo.app.dto;
import lombok.*;

import java.util.List;

import com.qradardemo.app.model.*;


@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class buyProductsDTO {
    private List<ItemDTO> carrito;
    private Cliente cliente;
}
