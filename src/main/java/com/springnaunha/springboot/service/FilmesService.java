package com.springnaunha.springboot.service;

import java.util.List;

import com.springnaunha.springboot.domain.Filmes;

public class FilmesService {
    public List<Filmes> listAll(){
        return List.of(new Filmes(1L, "O doador de memórias"), new Filmes(2L, "Relampago Mcqueen"));
    }
}
