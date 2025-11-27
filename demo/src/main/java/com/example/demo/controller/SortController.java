package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.SortService;
import com.example.demo.dto.CustomRequest;
import com.example.demo.dto.ErrorResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController 
@RequestMapping("/api/sort")  //path
public class SortController {

    @Autowired // hace una inyeccion de depndencias (verlo como hacer una instancia)
    SortService service;
   
    @PostMapping("/insertion")  // endpoint
    public ResponseEntity<?> postMethodName(@RequestBody CustomRequest request) {
        //TODO: process POST request
        
            if (request.getData()==null || request.getData().isBlank()) {
            ErrorResponse error = new ErrorResponse();
            error.setError("error en la entrada de datos");
            error.setDetail("necesitamos que llenes data con datos numericos");
            return ResponseEntity.badRequest().body(error);
            }

            if (!request.getData().contains(",")) {
                ErrorResponse error = new ErrorResponse();
                error.setError("error dedatos d entrada");
                error.setDetail("necesito las comas");
                return ResponseEntity.badRequest().body(error);
            }


        String requesData = request.getData();
        String[] stringData = requesData.split(","); // agrra un data  string y lo separa por lo que tu le pases en este caso comas
        int[] arrNum = new int[stringData.length];

        for (int i = 0; i < stringData.length; i++) {
            try{
                arrNum[i] = Integer.parseInt(stringData[i]);
            } catch (IllegalArgumentException e){
                ErrorResponse error = new ErrorResponse();
                error.setError("hubo un error de datos");
                error.setDetail("el dato: "+  arrNum[i] + " es un dato incorrecto");
                return ResponseEntity.badRequest().body(error);
            }
        }

        return ResponseEntity.ok(service.sort(arrNum));
       


       
    }
    
    

}
