package com.codeclan.example.FilesFolders.Components;

import com.codeclan.example.FilesFolders.Models.File;
import com.codeclan.example.FilesFolders.Models.Folder;
import com.codeclan.example.FilesFolders.Models.User;
import com.codeclan.example.FilesFolders.Respotories.FileRespotory;
import com.codeclan.example.FilesFolders.Respotories.FolderRespotory;
import com.codeclan.example.FilesFolders.Respotories.UserRespotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    UserRespotory userRespotory;

    @Autowired
    FolderRespotory folderRespotory;

    @Autowired
    FileRespotory fileRespotory;

    public DataLoader(){

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User chloe = new User("Chloe");
        userRespotory.save(chloe);

        Folder workFiles = new Folder("Work Files", chloe);
        folderRespotory.save(workFiles);

        File rubyFile = new File("Ruby", ".rb",3, workFiles);
        fileRespotory.save(rubyFile);

    }
}
