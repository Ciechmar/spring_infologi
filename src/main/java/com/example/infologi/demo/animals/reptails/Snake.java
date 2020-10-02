package com.example.infologi.demo.animals.reptails;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Snake implements Reptail{
    String SNAKE_SOUND = "Sssss ssssss";

    @Override
    public void sound(){
        log.info("Snake make: {}", SNAKE_SOUND);
    }

}
