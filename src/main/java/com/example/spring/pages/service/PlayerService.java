package com.example.spring.pages.service;

import com.example.spring.pages.entity.Player;
import com.example.spring.pages.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public Page<Player> getPlayers(Pageable pageable) {
        return playerRepository.findAll(pageable);
    }
}
