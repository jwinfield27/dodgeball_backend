package com.example.demo.enemy;

import java.util.Iterator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/enemy")
public class EnemyController {

    private final EnemyService enemyService;

    public EnemyController(EnemyService enemyService){
        this.enemyService = enemyService;
    }

    @GetMapping
    public Iterable<Enemy> getEnemies(){
        return enemyService.getEnemies();
    }

    @GetMapping("/level/{level}")
    public Iterator<Enemy> getEnemyByLevel(@PathVariable("level") int level){
        return enemyService.getEnemyByLevel(level);
    }

    @GetMapping("/level/random/{level}")
    public Enemy getRandomEnemyByLevel(@PathVariable("level") int level) {
        return enemyService.getRandomEnemyByLevel(level);
    }
    

    @PostMapping
    public Enemy postCharacter(@RequestBody Enemy enemy){
        return this.enemyService.createEnemy(enemy);
    }
}
