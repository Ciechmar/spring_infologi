package com.example.infologi.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
// gettery i settery sa wymagane by SpringConfiguration zaciągał te dane z application-properties
@Getter
@Setter
@ConfigurationProperties("com.sda.zoo")
public class ZooDetails {
    private String zooName;
    private String zooOwner;
    private String zooAddress;

}
