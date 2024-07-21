package com.example.password.validate.controller;

import com.example.password.validate.dto.PasswordRequestDTO;
import com.example.password.validate.service.PasswordValidateService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/validate")
@RequiredArgsConstructor
public class PasswordValidateController {
    private final PasswordValidateService service;


    @PostMapping
    public ResponseEntity<List<String>> validatePassword(@RequestBody PasswordRequestDTO password){
        var validate = service.validatePassword(password);
        if(!validate.isEmpty()){
            return new ResponseEntity<>(validate, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(validate, HttpStatus.NO_CONTENT);
    }
}
