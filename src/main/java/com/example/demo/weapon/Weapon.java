package com.example.demo.weapon;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "weapon")
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer weapon_id;
    private String name;
    private int level;
    private int damage;
    private int speed;
    private String weapon_type;
    private String char_type;

    public Weapon(){}

    public Weapon(String name, int level, int damage, int speed){
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getWeapon_type() {
        return weapon_type;
    }

    public void setWeapon_type(String weapon_type) {
        this.weapon_type = weapon_type;
    }

    public void setChar_type(String char_type){
        this.char_type = char_type;
    }

    public String getChar_type(){
        return this.char_type;
    }

}
