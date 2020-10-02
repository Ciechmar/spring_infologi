package com.example.infologi.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("com.sda.zoo")
public class ZooDetails {
    private String zooName;
    private String zooOwner;
    private String zooAddress;

}
