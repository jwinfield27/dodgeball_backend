package com.example.demo.character;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/character")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService){
        this.characterService = characterService;
    }

    @GetMapping
    public Iterable<Character> getCharacters(){
        return characterService.getCharacters();
    }

    @PostMapping
    public Character postCharacter(@RequestBody Character character){
        return this.characterService.createCharacter(character);
    }
}
