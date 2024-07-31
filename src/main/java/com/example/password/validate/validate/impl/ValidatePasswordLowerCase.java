package com.example.password.validate.validate.impl;

import com.example.password.validate.validate.ValidatePassword;
import org.springframework.stereotype.Component;

@Component
public class ValidatePasswordLowerCase implements ValidatePassword {
    @Override
    public String validate(String password) {
        if (!password.matches(".*[a-z].*")){
            return "the password must have at least one lowercase letter";
        }
        return null;
    }
}
