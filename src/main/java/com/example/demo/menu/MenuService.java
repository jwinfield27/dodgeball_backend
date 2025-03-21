package com.example.demo.menu;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class MenuService {
    private final MenuRepository menuRepository;

    public MenuService(MenuRepository menuRepository){
        this.menuRepository = menuRepository;
    }

    @GetMapping
    public Menu getMenuData(){
        return this.menuRepository.findById(1).get();
    }

    @PostMapping
    public Menu postMenuData(Menu menu){
        return this.menuRepository.save(menu);
    }
}
