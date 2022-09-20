package com.springnaunha.springboot.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.springnaunha.springboot.domain.Filmes;
import com.springnaunha.springboot.service.FilmesService;
import com.springnaunha.springboot.util.DateUtil;


import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("filmes")
@Log4j2
@RequiredArgsConstructor //Cria um construtor - lombok
public class FilmesController {
    
    private final DateUtil dateUtil;
    private final FilmesService filmesService;

    
    @GetMapping
    public ResponseEntity<List<Filmes>> list() {
        dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now());
        return new ResponseEntity<>(filmesService.listAll(), HttpStatus.OK);
        //return ResponseEntity.ok(filmesService.listaAll());

    }

    @GetMapping(path="/{id}")
    public ResponseEntity<Filmes> findById(@PathVariable long id) {
        return ResponseEntity.ok(filmesService.findById(id));

    }
}
