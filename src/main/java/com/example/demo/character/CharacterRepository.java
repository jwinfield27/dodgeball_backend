package com.example.demo.character;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CharacterRepository extends CrudRepository<Character, Integer>{

    List<Character> findByLevel(int level);
    List<Character> findByName(String name);
}
