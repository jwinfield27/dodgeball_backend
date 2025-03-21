package com.example.demo.weapon;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface WeaponRepository extends JpaRepository<Weapon, Integer>{

    @Query("select w from Weapon w WHERE w.char_type LIKE %:char_type%")
    List<Weapon> GetAllWeaponsForCharType(String char_type);
}