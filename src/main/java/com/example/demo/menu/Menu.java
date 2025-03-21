package com.example.demo.menu;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@jakarta.persistence.Entity
@Table(name = "menu")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;

    private String backgroundColor;

    private String buttonTheme;

    private String version;

    private Menu(){}

    public Menu(String title, String backgroundColor, String buttonTheme, String version){
        this.title = title;
        this.backgroundColor = backgroundColor;
        this.buttonTheme = buttonTheme;
        this.version = version;
    }

    public String getTitle(){
        return this.title;
    }

    public String getBackgroundColor(){
        return this.backgroundColor;
    }

    public String getButtonTheme(){
        return this.buttonTheme;
    }

    public String getVersion(){
        return this.version;
    }
}
