package com.example.codeclan.usersfilesfolders.repositories;

import com.example.codeclan.usersfilesfolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
