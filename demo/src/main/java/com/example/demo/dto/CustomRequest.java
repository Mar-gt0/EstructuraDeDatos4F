package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getter and setters
@AllArgsConstructor // constructor parametrizado (con todos los atributos)
@NoArgsConstructor //  coonstructor sin parametros (vacio)

public class CustomRequest {

    String data;

}
