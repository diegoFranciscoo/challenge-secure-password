package com.example.password.validate.validate.impl;

import com.example.password.validate.validate.ValidatePassword;
import org.springframework.stereotype.Component;

@Component
public class ValidatePasswordUpperCase implements ValidatePassword {
    @Override
    public String validate(String password) {
        if (!password.matches(".*[A-Z].*")) {
            return "the password must have at least one uppercase letter";
        }
        return null;
    }
}
