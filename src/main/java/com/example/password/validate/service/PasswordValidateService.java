package com.example.password.validate.service;

import com.example.password.validate.dto.PasswordRequestDTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class PasswordValidateService {


    public List<String> validatePassword(PasswordRequestDTO password) {
        List<String> errorList = new ArrayList<>();

        validateLenght(errorList, password.password());
        validateUpperCase(errorList, password.password());
        validateSpecialCharacter(errorList, password.password());
        validateLowerCase(errorList, password.password());
        validateNumericDigit(errorList,password.password());

        return errorList;
    }

    private List<String> validateLenght(List<String> errorList, String password) {
        if (password.length() < 8) {
            errorList.add("a senha deve ter pelo menos 8 caracteres");
        }
        return errorList;
    }

    private List<String> validateUpperCase(List<String> errorList, String password) {
        if (!Pattern.matches(".*[A-Z].*", password)) {
            errorList.add("a senha deve ter pelo menos uma letra maiuscula");
        }
        return errorList;
    }

    private List<String> validateLowerCase(List<String> errorList, String password) {
        if (!Pattern.matches(".*[a-z].*", password)) {
            errorList.add("a senha deve ter pelo menos uma letra minuscula");
        }
        return errorList;
    }

    private List<String> validateNumericDigit(List<String> errorList, String password) {
        if (!Pattern.matches(".*[0-9].*", password)) {
            errorList.add("a senha deve ter pelo menos um digito numerico");
        }
        return errorList;
    }

    private List<String> validateSpecialCharacter(List<String> errorList, String password) {
        if (!Pattern.matches(".*[\\W].*", password)) {
            errorList.add("a senha deve ter pelo menos um caractere especial");
        }
        return errorList;
    }


}
