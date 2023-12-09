package com.example.ss_2022_c2_e1.repository;

import com.example.ss_2022_c2_e1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {


    @Query("select u from User u where u.username = :username")
    Optional<User> findUserByUsername(String username);
}
