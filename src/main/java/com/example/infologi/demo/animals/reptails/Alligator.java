package com.example.infologi.demo.animals.reptails;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Alligator implements Reptail{
    String ALLIGATOR_SOUND = "Kłap Kłap Mniam";

    @Override
    public void sound(){
        log.info("Alligator make: {}", ALLIGATOR_SOUND);
    }

}
