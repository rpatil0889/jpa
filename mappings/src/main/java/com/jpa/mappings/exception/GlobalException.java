package com.jpa.mappings.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(EmployeeNotFound.class)
    public ResponseEntity<Map<String, Object>> handleResourceNotFoundException(EmployeeNotFound exception) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(map);
    }

}
