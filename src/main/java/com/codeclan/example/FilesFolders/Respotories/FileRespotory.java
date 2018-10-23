package com.codeclan.example.FilesFolders.Respotories;

import com.codeclan.example.FilesFolders.Models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRespotory extends JpaRepository<File, Long> {
}
