package com.example.demo.theme;

import org.springframework.stereotype.Service;

@Service
public class ThemeService {

    private final ThemeRepository themeRepository;

    public ThemeService(ThemeRepository themeRepository){
        this.themeRepository = themeRepository;
    }

    public Theme getThemeData(){
        return themeRepository.findById(1).get();
    }

    public Theme saveTheme(Theme theme){
        return this.themeRepository.save(theme);
    }

}
