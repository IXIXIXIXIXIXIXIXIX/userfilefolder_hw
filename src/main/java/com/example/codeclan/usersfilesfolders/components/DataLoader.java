package com.example.codeclan.usersfilesfolders.components;

import com.example.codeclan.usersfilesfolders.models.File;
import com.example.codeclan.usersfilesfolders.models.Folder;
import com.example.codeclan.usersfilesfolders.models.User;
import com.example.codeclan.usersfilesfolders.repositories.FileRepository;
import com.example.codeclan.usersfilesfolders.repositories.FolderRepository;
import com.example.codeclan.usersfilesfolders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User user1 = new User("Homer");
        userRepository.save(user1);

        User user2 = new User("Marge");
        userRepository.save(user2);

        Folder folder1 = new Folder("Beers", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Mad Hair Features", user2);
        folderRepository.save(folder2);

        File file1 = new File("Duff", "txt", 128, folder1);
        fileRepository.save(file1);
    }
}
