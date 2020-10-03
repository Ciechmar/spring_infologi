package com.example.infologi.demo;
//Lombok dział na zasadzie wavingo -ustawia przed uruchomieniem programu,wstawia sobie kod miedzy kompilacją a uruchomieniem.
//Spring działa na refleksji.

import com.example.infologi.demo.animals.Animal;
import com.example.infologi.demo.animals.reptails.Reptail;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.util.List;

@Component
@Slf4j
public class Zoo implements CommandLineRunner {

//    private  static final Logger log = (Logger) org.slf4j.LoggerFactory.getLogger(Zoo.class);

    private Animal elephant;
    private Animal penguin;
    private Reptail alligator;
    private Reptail snake;
    private Reptail lizard;
    private final BufferedReader bufferedReader;
    private String zooName;
    private ZooDetails zooDetails;
    List<Reptail> reptails;

    @Autowired
    public Zoo(@Qualifier("elephant") Animal elephant,
                Animal penguin,
               BufferedReader bufferedReader,
               @Value("${com.sda.zoo.zoo-name}")
                       String zooName,
               List<Reptail> reptails,
               ZooDetails zooDetails) {
        this.elephant = elephant;
        this.penguin = penguin;
        this.reptails = reptails;
        this.zooName = zooName;
        this.bufferedReader = bufferedReader;
        this.zooDetails =zooDetails;

    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from zoo");
        log.info(bufferedReader.readLine());
        elephant.sound();
        penguin.sound();
        reptails.forEach(Reptail::sound);

        log.info(zooName);

        System.out.println("*****************");

        log.info(zooDetails.toString());


    }
}
