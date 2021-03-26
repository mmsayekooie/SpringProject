package com.example.practice.dao;

import com.example.practice.entities.UserRole;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRole,Long> {
    Page<UserRole> findAll(Pageable pageable);
    Optional<UserRole> findById(Long id);
}
