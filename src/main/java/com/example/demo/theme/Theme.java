package com.example.demo.theme;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@jakarta.persistence.Entity
@Table(name = "theme")
public class Theme {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Integer id;

    private String backgroundTheme;

    private Theme() {}

    Theme(String background_theme){
        this.backgroundTheme = background_theme;
    }

    public String getBackgroundTheme(){
        return this.backgroundTheme;
    }
}
