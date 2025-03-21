package com.example.demo.sprite;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SpriteRepository extends JpaRepository<Sprite, Integer> {

    @Query("select sprite_image from Sprite")
    List<byte[]> getAllImageData();

    @Query("SELECT s FROM Sprite s WHERE s.sprite_name LIKE %:substring%")
    Iterable<Sprite> getSpritesWithSubstring(@Param("substring") String substring);
}
