package com.qradardemo.app.dto;
import lombok.*;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class LoginInputDTO {
    private String email;
    private String password;  
}
