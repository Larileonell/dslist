package com.devlari.dslist.dto;

import com.devlari.dslist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;
    public GameListDTO (){}

    public GameListDTO(GameList entinty) {
       id= entinty.getId();
       name = entinty.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
