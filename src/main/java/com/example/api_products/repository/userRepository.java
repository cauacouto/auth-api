package com.example.api_products.repository;

import com.example.api_products.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface userRepository extends JpaRepository<User, String> {

    UserDetails findByLogin(String login);

    boolean existsByLogin(String login);
}
