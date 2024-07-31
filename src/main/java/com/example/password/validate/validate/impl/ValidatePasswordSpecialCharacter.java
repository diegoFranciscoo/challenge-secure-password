package com.example.password.validate.validate.impl;

import com.example.password.validate.validate.ValidatePassword;
import org.springframework.stereotype.Component;

@Component
public class ValidatePasswordSpecialCharacter implements ValidatePassword {
    @Override
    public String validate(String password) {
        if (!password.matches(".*[\\W].*")) {
            return "the password must have at least one special character";
        }
        return null;
    }
}
