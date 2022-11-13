package com.example.ecommercerest.api;

import com.example.ecommercerest.model.JsonConverter;
import com.example.ecommercerest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/product")
@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void addProduct(@RequestBody JsonConverter.Product product) {
        productService.addProduct(product);
    }

    @GetMapping
    public List<JsonConverter.Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping(path = "/{name}")
    public JsonConverter.Product getProductByName(@PathVariable("name") String name) {
        return productService.getProductByName(name)
                .orElse(null);
    }

    @DeleteMapping(path = "{name}")
    public void deleteProductByName(@PathVariable("name") String name) {
        productService.deleteProduct(name);
    }

    @PutMapping(path = "{name}")
    public void updateProduct(@PathVariable("name") String name, @RequestBody JsonConverter.Product productToUpdate) {
        productService.updateProduct(name, productToUpdate);
    }

}
