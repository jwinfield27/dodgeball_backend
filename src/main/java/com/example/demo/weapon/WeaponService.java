package com.example.demo.weapon;

import java.util.List;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class WeaponService {

    Random random = new Random();
    private final WeaponRepository weaponRepository;

    public WeaponService(WeaponRepository weaponRepository){
        this.weaponRepository = weaponRepository;
    }

    public Weapon getWeaponById(int id){
        return weaponRepository.findById(id).get();
    }

    public Weapon getRandomEnemyWeapon(int enemy_level){
        List<Weapon> weapons = weaponRepository.GetAllWeaponsForEnemies(enemy_level);
        System.out.println(weapons.size());
        return weapons.get(random.nextInt(weapons.size()));
    }
 
    public Weapon getRandomCharacterWeapon(){
        List<Weapon> weapons = weaponRepository.GetAllWeaponsForCharacter();
        return weapons.get(random.nextInt(weapons.size()));
    }
}
