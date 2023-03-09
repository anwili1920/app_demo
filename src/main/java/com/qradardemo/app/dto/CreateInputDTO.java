package com.qradardemo.app.dto;
import com.qradardemo.app.model.Cliente;
import com.qradardemo.app.model.Usuario;

import lombok.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class CreateInputDTO {
    Cliente cliente;
    Usuario usuario;
}
