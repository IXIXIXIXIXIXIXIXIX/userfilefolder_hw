package com.example.codeclan.usersfilesfolders.repositories;

import com.example.codeclan.usersfilesfolders.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
