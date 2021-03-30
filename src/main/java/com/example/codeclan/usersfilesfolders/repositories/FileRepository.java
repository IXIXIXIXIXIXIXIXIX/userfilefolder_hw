package com.example.codeclan.usersfilesfolders.repositories;

import com.example.codeclan.usersfilesfolders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
