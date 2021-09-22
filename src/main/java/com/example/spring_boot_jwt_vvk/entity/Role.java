package com.example.spring_boot_jwt_vvk.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class Role extends  BaseEntity{
    private String roleName;

    private String roleKey;

    @OneToMany(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    @JoinTable(name = "t_role_permission", joinColumns = {@JoinColumn(name = "role_id")}, inverseJoinColumns = {@JoinColumn(name = "permission_id")})
    private Set<Permission> permissions = new HashSet<>();
}
