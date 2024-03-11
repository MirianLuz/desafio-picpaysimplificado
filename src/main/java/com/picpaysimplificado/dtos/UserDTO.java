package com.picpaysimplificado.dtos;

import com.picpaysimplificado.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, UserType userType, String document, BigDecimal balance, String email, String password) {
}
