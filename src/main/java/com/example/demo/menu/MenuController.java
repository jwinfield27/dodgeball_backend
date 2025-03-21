package com.example.demo.menu;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MenuController {

    private final MenuService menuService;

    public MenuController(MenuService menuService){
        this.menuService = menuService;
    }

    @GetMapping("/menu")
    public Menu getMenuData(){
        return this.menuService.getMenuData();
    }

    @PostMapping(value="/menu", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Menu addMenuData(@RequestBody Menu menu){
        return this.menuService.postMenuData(menu);
    }
}
