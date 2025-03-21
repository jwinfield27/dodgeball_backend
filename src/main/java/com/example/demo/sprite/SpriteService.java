package com.example.demo.sprite;

import java.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SpriteService {
    private final SpriteRepository spriteRepository;
    
    public SpriteService(SpriteRepository spriteRepository){
        this.spriteRepository = spriteRepository;
    }

    public Iterable<Sprite> getSpriteImages(){
        return this.spriteRepository.findAll();
    }

    public Sprite getSpriteDataById(int id){
        return spriteRepository.findById(id).get();
    }

    public Sprite saveSprite(Sprite sprite){
        return this.spriteRepository.save(sprite);
    }

    public void saveAllSprites(Iterable<Sprite> sprite){
        this.spriteRepository.saveAll(sprite);
    }

    public Optional<Sprite> getById(int id){
        return this.spriteRepository.findById(id);
    }

    public Iterable<byte[]> getAllImageData(){
        return this.spriteRepository.getAllImageData();
    }

    public byte[] getImageData(int id){
        return this.spriteRepository.findById(id).get().getData();
    }

    public Iterable<Sprite> getSpritesWithSubstring(String substring){
        Iterable<Sprite> sprites = this.spriteRepository.getSpritesWithSubstring(substring);
        Iterator<Sprite> iter = sprites.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().getName());
        }
        return sprites;
    }
    
}
