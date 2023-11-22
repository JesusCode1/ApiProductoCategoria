/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cibertec.ApiProductoCategoria.exception;

import com.cibertec.ApiProductoCategoria.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {@ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorResponseDto>handleEntityNotFound(EntityNotFoundException ex){            
        var status = HttpStatus.NOT_FOUND;            
        var errorResponse=new ErrorResponseDto(status,ex.getMessage(),ex.toString());     
        return new ResponseEntity<>(errorResponse,status);       
    }  
}
