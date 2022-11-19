package com.example.ecommercerest.Controllers;

import com.example.ecommercerest.Models.Product;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RequestMapping("products")
@RestController
public class ProductController {

    @GetMapping("/allProducts")
    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> productArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product product = new Product("Vincent", "Lorem", 12.23, "Image");
            productArray.add(product);
        }

        return productArray;

    }

    @GetMapping("/testAPI")
    public Product testProductAPI(@RequestParam String name, @RequestParam String desc, @RequestParam double price, @RequestParam String imageURL) {
        return new Product(name, desc, price, imageURL);
    }


    public String parseProducts() {
        return "";
    }
}
