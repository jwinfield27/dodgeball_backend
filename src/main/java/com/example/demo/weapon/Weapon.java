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
    private int momentum;
    private String weapon_type;
    private boolean for_enemy;
    private boolean for_character;

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

    public int getMomentum() {
        return momentum;
    }

    public void setMomentum(int momentum) {
        this.momentum = momentum;
    }

    public String getWeapon_type() {
        return weapon_type;
    }

    public void setWeapon_type(String weapon_type) {
        this.weapon_type = weapon_type;
    }

    public boolean getFor_enemy(){
        return this.for_enemy;
    }

    public void setFor_enemy(boolean for_enemy){
        this.for_enemy = for_enemy;
    }

    public boolean getFor_character(){
        return this.for_character;
    }

    public void setFor_character(boolean for_character){
        this.for_character = for_character;
    }

}
