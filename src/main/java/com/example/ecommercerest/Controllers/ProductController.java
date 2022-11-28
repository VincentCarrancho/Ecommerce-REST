package com.example.ecommercerest.Controllers;

import com.example.ecommercerest.Models.Product;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;

@RequestMapping("products")
@RestController
public class ProductController {

    @GetMapping("/allProducts")
    public Map<?, ?> getAllProducts() {
        Map<?,?> map = null;
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get("products.json"));

            map = gson.fromJson(reader, Map.class);
            System.out.println(map.toString());

        } catch (Exception e) {
            System.out.println(e);
        }
        return map;
    }

    @GetMapping("/testAPI")
    public Product testProductAPI(@RequestParam String name, @RequestParam String desc, @RequestParam double price, @RequestParam String imageURL) {
        return new Product(name, desc, price, imageURL);
    }


}
