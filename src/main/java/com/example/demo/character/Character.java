package com.example.demo.character;

import java.util.ArrayList;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "character")
public class Character {
    static ArrayList<Character> Data = new ArrayList<Character>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int level;

    private int size;

    Character() {
    }

    Character(String name, int level, int size) {
        this.name = name;
        this.level = level;
        this.size = size;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getLevel(){
        return this.level;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public Integer getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String toString() {
        return String.format("name:%s,level:%d,size:%d",
                                this.name,
                                this.level,
                                this.size
                            );
    }
}
