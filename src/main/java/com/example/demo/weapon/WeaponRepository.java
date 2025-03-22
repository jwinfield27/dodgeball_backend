package com.example.demo.weapon;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface WeaponRepository extends JpaRepository<Weapon, Integer>{

    @Query("select w from Weapon w WHERE w.for_enemy = true")
    List<Weapon> GetAllWeaponsForEnemies();

    @Query("select w from Weapon w WHERE w.for_character = true")
    List<Weapon> GetAllWeaponsForCharacter();
}