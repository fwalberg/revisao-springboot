package com.springnaunha.repository;

import java.util.List;

import com.springnaunha.springboot.domain.Filmes;

public interface FilmesRepository {
    List<Filmes> listAll();
    
}
