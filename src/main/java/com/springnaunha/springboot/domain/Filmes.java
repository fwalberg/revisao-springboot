package com.springnaunha.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // gera construtor, getter, setter, equals, hashcode
@AllArgsConstructor
public class Filmes {
    private Long id;
    private String name;

        
}
