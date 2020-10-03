package com.example.infologi.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

// gettery i settery sa wymagane by SpringConfiguration zaciągał te dane z application-properties
@Getter
@Setter
@ToString
@ConfigurationProperties("com.sda.zoo")
public class ZooDetails {
    private String zooName;
    private String zooOwner;
    private String zooAddress;
    private List<String> tel;
    private Map<String, String> openHours;
}
