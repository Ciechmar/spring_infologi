package com.example.infologi.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Configuration
public class Config {
    private final String PATH = "C:\\Users\\ciech\\IdeaProjects\\infologi\\src\\main\\resources\\welcome.txt";

    @Bean // Spring tym zarządza
    public BufferedReader getBufferedReader()  {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(PATH));
            Files.newBufferedReader(Path.of(PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bufferedReader;
    }

    @Bean // Tworzę klase słówkiem NEW i od teraz Spring zarządza tym obiektem
    public DataObject MojBeam (){
        DataObject myObject = new DataObject(); // Czemu nie dział jak zrobie konstruktor mimo że w
        return myObject;
    }
}
