package com.example.spring.pages.controller;

import com.example.spring.pages.entity.Player;
import com.example.spring.pages.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pages/players")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping
    public String index(@PageableDefault(page = 0, size = 10) Pageable pageable, Model model) {

        Page<Player> playerPage = playerService.getPlayers(pageable);

        model.addAttribute("page", playerPage);
        model.addAttribute("players", playerPage.getContent());

        return "pages/index";
    }
}
