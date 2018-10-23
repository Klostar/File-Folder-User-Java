package com.codeclan.example.FilesFolders.Respotories;

import com.codeclan.example.FilesFolders.Models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRespotory extends JpaRepository<Folder, Long> {
}
