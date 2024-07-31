package com.example.password.validate.service;

import com.example.password.validate.dto.ResponseValidate;
import com.example.password.validate.validate.ValidatePassword;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class PasswordService {
    private final List<ValidatePassword> validatePasswords;

    public ResponseValidate getValidate(String password) {
        List<String> list = validatePasswords.stream()
                .map(validate -> validate.validate(password))
                .filter(Objects::nonNull)
                .toList();
        return new ResponseValidate(list);
    }
}
