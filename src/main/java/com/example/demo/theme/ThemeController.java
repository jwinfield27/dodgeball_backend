package com.example.demo.theme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThemeController {
    private final ThemeService themeService;

    public ThemeController(ThemeService themeService){
        this.themeService = themeService;
    }

    @GetMapping("/theme")
    public Theme getThemeData(){
        return this.themeService.getThemeData();
    }

    @PostMapping("/theme")
    public Theme postThemeData(@RequestBody Theme theme){
        return this.themeService.saveTheme(theme);
    }

}
