package com.example.demo.enemy;

import org.springframework.stereotype.Service;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@Service
public class EnemyService {

    Random rand = new Random();
    private final EnemyRepository enemyRepository;

    public EnemyService(EnemyRepository enemyRepository){
        this.enemyRepository = enemyRepository;
    }

    public Iterable<Enemy> getEnemies() {
        return this.enemyRepository.findAll();
    }

    public Iterator<Enemy> getEnemyByLevel(int level) {
        return this.enemyRepository.findByLevel(level).iterator();
    }

    public Enemy getRandomEnemyByLevel(int level) {
        List<Enemy> enemies = this.enemyRepository.findByLevel(level);
        return enemies.get(rand.nextInt(enemies.size()));
    }

    public Enemy createEnemy(Enemy enemy){
        return this.enemyRepository.save(enemy);
    }

}
