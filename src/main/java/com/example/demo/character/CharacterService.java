package com.example.demo.character;

import org.springframework.stereotype.Service;

@Service
public class CharacterService {

    private final CharacterRepository characterRepository;

    public CharacterService(CharacterRepository characterRepository){
        this.characterRepository = characterRepository;
    }

    public Iterable<Character> getCharacters() {
        return this.characterRepository.findAll();
    }

    public Character createCharacter(Character character){
        return this.characterRepository.save(character);
    }
}
