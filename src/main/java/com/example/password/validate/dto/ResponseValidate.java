package com.example.password.validate.dto;

import java.util.List;

public record ResponseValidate(List<String> passwordErrors) {
}
