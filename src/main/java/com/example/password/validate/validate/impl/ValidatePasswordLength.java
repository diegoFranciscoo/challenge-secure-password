package com.example.password.validate.validate.impl;

import com.example.password.validate.validate.ValidatePassword;
import org.springframework.stereotype.Component;

@Component
public class ValidatePasswordLength implements ValidatePassword {

    @Override
    public String validate(String password) {
        if (password.length() < 8){
            return "the password must be at least 8 characters long";
        }
        return null;
    }
}
