package com.example.demo.weapon;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/weapon")
public class WeaponController {

    private final WeaponService weaponService;

    public WeaponController(WeaponService weaponService){
        this.weaponService = weaponService;
    }

    @GetMapping("/{id}")
    public Weapon getMethodName(@PathVariable int id) {
        return weaponService.getWeaponById(id);
    }

    @GetMapping("/random/{char_type}")
    public Weapon getRandomWeapon(@PathVariable String char_type){
        return weaponService.getRandomWeapon(char_type);
    }
}
