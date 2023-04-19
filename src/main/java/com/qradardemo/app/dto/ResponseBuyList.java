package com.qradardemo.app.dto;

import com.qradardemo.app.model.Cliente;
import com.qradardemo.app.model.Compra; 
import lombok.*;
@Getter @Setter @NoArgsConstructor
public class ResponseBuyList {
    Cliente cliente;
    Compra compra;
}
