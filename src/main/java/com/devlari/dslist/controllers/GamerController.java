package com.devlari.dslist.controllers;

import com.devlari.dslist.dto.GameDTO;
import com.devlari.dslist.dto.GameMinDTO;
import com.devlari.dslist.entities.Game;
import com.devlari.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GamerController {
    @Autowired
    private GameService gameService;
    @GetMapping(value = "/{id}")
    public GameDTO findById (@PathVariable Long id) {
        GameDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }
}
