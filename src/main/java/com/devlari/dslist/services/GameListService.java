package com.devlari.dslist.services;

import com.devlari.dslist.dto.GameListDTO;
import com.devlari.dslist.dto.GameMinDTO;
import com.devlari.dslist.entities.Game;
import com.devlari.dslist.entities.GameList;
import com.devlari.dslist.repositories.GameListRepository;
import com.devlari.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Stream;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll (){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x-> new GameListDTO(x)).toList();
    }
}
