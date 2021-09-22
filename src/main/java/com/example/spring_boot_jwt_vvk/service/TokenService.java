package com.example.spring_boot_jwt_vvk.service;


import com.example.spring_boot_jwt_vvk.entity.Token;

public interface TokenService {
    Token createToken(Token token);

    Token findByToken(String token);
}
