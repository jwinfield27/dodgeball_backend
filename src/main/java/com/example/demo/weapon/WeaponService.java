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

    public Weapon getRandomWeapon(String char_type){
        List<Weapon> stuff = weaponRepository.GetAllWeaponsForCharType(char_type);
        return stuff.get(random.nextInt(stuff.size()));
    }
}
