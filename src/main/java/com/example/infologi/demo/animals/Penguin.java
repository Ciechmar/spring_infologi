package com.example.infologi.demo.animals;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Penguin implements Animal {
    private final String PENGUIN_SOUND = "Uaaaałł";

    @Override
    public void sound() {
        log.info("Pengiun make: {}", PENGUIN_SOUND);

    }
}
