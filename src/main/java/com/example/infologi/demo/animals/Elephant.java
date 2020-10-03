package com.example.infologi.demo.animals;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Primary
public class Elephant implements Animal{
    String ELEPHANT_SOUND = "Tereee";

    @Override
    public void sound(){
        log.info("Elephant make: {}", ELEPHANT_SOUND);
    }

}
