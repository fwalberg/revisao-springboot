package com.springnaunha.springboot.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.springnaunha.springboot.domain.Filmes;

@Service
public class FilmesService {

    private List<Filmes> filmes = List.of(new Filmes(1L, "O doador de memórias"), new Filmes(2L, "Relampago Mcqueen"));

    public List<Filmes> listAll(){
        return filmes;
    }

    public Filmes findById(long id) {
        return filmes.stream()
            .filter(filmes -> filmes.getId().equals(id))
            .findFirst()
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Movie not found"));
    }
}
