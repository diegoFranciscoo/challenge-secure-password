package com.example.password.validate.controller;

import com.example.password.validate.dto.Password;
import com.example.password.validate.dto.ResponseValidate;
import com.example.password.validate.service.PasswordService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/validate-password")
public class PasswordController {
    private final PasswordService service;

    @PostMapping
    public ResponseEntity<ResponseValidate> getValidate(@RequestBody Password password) {
        ResponseValidate validate = service.getValidate(password.password());

        if (validate.passwordErrors().isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(validate, HttpStatus.BAD_REQUEST);
    }
}
