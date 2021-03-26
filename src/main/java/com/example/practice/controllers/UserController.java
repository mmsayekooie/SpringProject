package com.example.practice.controllers;

import com.example.practice.dao.UserRoleRepository;
import com.example.practice.entities.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserRoleRepository userRoleRepository;

    @Autowired
    public UserController(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @GetMapping("/roles")
    @ResponseBody
    public Page<UserRole> getRoles(Pageable pageable){
        return userRoleRepository.findAll(pageable);
    }

    @GetMapping("/role/{id}")
    @ResponseBody
    public Optional<UserRole> getRoles(@PathVariable Long id){
        return userRoleRepository.findById(id);
    }
}
