package com.example.demo.sprite;

import jakarta.persistence.Table;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
@Table(name = "sprite")
public class Sprite {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    @Column(name = "content_type")
    private String content_type;

    @Column(name = "sprite_name")
    private String sprite_name;

	@Column(name = "sprite_image")
    private byte[] sprite_image;

    public Sprite(){}

    public Sprite(String content_type, byte[] sprite_image, String sprite_name){
        this.content_type = content_type;
        this.sprite_image = sprite_image;
        this.sprite_name = sprite_name;
    }

    public byte[] getData() {
        return sprite_image;
    }

    public int getId(){
        return this.id;
    }

    public void setData(byte[] data) {
        this.sprite_image = data;
    }

    public String getName() {
        return this.sprite_name;
    }

    public void setName(String name){
        this.sprite_name = name;
    }
}
