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

    public Weapon getRandomEnemyWeapon(){
        List<Weapon> stuff = weaponRepository.GetAllWeaponsForEnemies();
        return stuff.get(random.nextInt(stuff.size()));
    }

    public Weapon getRandomCharacterWeapon(){
        List<Weapon> stuff = weaponRepository.GetAllWeaponsForCharacter();
        return stuff.get(random.nextInt(stuff.size()));
    }
}
