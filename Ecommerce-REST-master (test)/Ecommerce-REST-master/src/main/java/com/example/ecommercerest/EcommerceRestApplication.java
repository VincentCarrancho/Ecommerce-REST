package com.example.ecommercerest;


import com.example.ecommercerest.model.JsonConverter;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@SpringBootApplication
@RestController
public class EcommerceRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceRestApplication.class, args);
    }
    @GetMapping
    public String checkConnection() {
        System.out.println("Connected To REST Client");
        return "Connected To REST Client";
    }


}
