package com.example.demo.enemy;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
    
public interface EnemyRepository extends CrudRepository<Enemy, Integer>{
    
    List<Enemy> findByLevel(int level);
    List<Enemy> findByName(String name);
}
