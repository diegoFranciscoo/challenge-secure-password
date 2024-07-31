package com.example.password.validate.validate.impl;

import com.example.password.validate.validate.ValidatePassword;
import org.springframework.stereotype.Component;

@Component
public class ValidatePasswordNumericDigit implements ValidatePassword {
    @Override
    public String validate(String password) {
        if (!password.matches(".*[0-9].*")) {
            return "the password must have at least one numeric digit";
        }
        return null;
    }
}
