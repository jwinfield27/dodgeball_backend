package com.example.demo.enemy;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "enemy")
public class Enemy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int level;

    private int sprite_size;

    public Enemy(){}

    public Enemy(String name, int level, int weapon_id, int sprite_size){
        this.name = name;
        this.level = level;
        this.sprite_size = sprite_size;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getLevel(){
        return level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getSprite_size() {
        return sprite_size;
    }

    public void setSprite_size(int sprite_size) {
        this.sprite_size = sprite_size;
    }

    public String toString() {
        return String.format("name:%s,level:%d",
                                this.name,
                                this.level
                            );
    }

}
