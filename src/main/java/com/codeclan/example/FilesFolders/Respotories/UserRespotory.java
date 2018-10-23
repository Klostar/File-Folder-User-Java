package com.codeclan.example.FilesFolders.Respotories;

import com.codeclan.example.FilesFolders.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespotory extends JpaRepository<User, Long> {
}
