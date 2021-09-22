package com.example.spring_boot_jwt_vvk.service;


import com.example.spring_boot_jwt_vvk.auth.UserPrincipal;
import com.example.spring_boot_jwt_vvk.entity.User;

public interface UserService {
    User createUser(User user);
    UserPrincipal findByUsername(String username);
}
