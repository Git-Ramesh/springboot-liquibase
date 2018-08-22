package com.rs.springbootliquibase.repository;

import com.rs.springbootliquibase.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
