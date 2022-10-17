package com.example.ecommercerest.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/product")
public class ProductController {

    @GetMapping
    public String checkConnection() {
        System.out.println("Connected to Product Mapping");
        return "This is mapped to product controller";
    }
}
