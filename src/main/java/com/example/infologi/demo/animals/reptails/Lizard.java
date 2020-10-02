package com.example.infologi.demo.animals.reptails;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Lizard implements Reptail{
    String LIZARD_SOUND = "Tssss tssss";

    @Override
    public void sound(){
        log.info("Lizard make: {}", LIZARD_SOUND);
    }

}
