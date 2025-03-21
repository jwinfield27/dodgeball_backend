package com.example.demo.sprite;

import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/sprites")
public class SpriteController {
    private final SpriteService spriteService;

    public SpriteController(SpriteService spriteService){
        this.spriteService = spriteService;
    }

    @GetMapping("/all")
    public Iterable<Sprite> getAllSprites(){
        return this.spriteService.getSpriteImages();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<byte[]> getImageDataById(@PathVariable("id") int sprite_id) {
        return ResponseEntity.ok().contentType(MediaType.valueOf("image/jpeg")).body(this.spriteService.getImageData(sprite_id));
    }

    @GetMapping("/contains/{title_substring}")
    public ResponseEntity<Iterable<Sprite>> getAllEntitiesWithSubstring(@PathVariable("title_substring") String substring){
        return ResponseEntity.ok().body(this.spriteService.getSpritesWithSubstring(substring));
    }

    @PostMapping(value = "/upload")
    public ResponseEntity<?> postMethodName(@RequestParam("file") MultipartFile entity, @RequestParam("name") String name) {
        try{
            byte[] entity_bytes = entity.getBytes();
            return ResponseEntity.status(HttpStatus.CREATED).body(
                                                        this.spriteService.saveSprite(
                                                            new Sprite(entity.getContentType(), entity_bytes, name)
                                                        )
                                                    );
        }
        catch(IOException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error uploading image " + e.toString());
        }
    }

    @PostMapping("/upload/all")
    public ResponseEntity<String> postMethodName(@RequestParam("file[]") MultipartFile[] files, @RequestParam("name") String[] names) throws IOException {
        List<Sprite> sprites = new ArrayList<Sprite>();
        for(int i = 0; i < files.length; i++){
            Sprite sprite = new Sprite("", files[i].getBytes(), names[i]);
            sprites.add(sprite);
        }
        this.spriteService.saveAllSprites(sprites);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
    
}
