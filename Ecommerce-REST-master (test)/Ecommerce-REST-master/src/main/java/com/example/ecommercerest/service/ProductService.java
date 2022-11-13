package com.example.ecommercerest.service;

import com.example.ecommercerest.dao.ProductDao;
import com.example.ecommercerest.model.JsonConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductService(@Qualifier("Dao") ProductDao productDao) {

        this.productDao = productDao;

    }

    public int addProduct(JsonConverter.Product product) {

        return productDao.insertProduct(product);
    }

    public List<JsonConverter.Product> getAllProducts() {
        return productDao.selectAllProducts();
    }

    public Optional<JsonConverter.Product> getProductByName(String name) {
        return productDao.selectProductByName(name);
    }

    public int deleteProduct(String name) {
        return productDao.deleteProductByName(name);
    }

    public int updateProduct(String name, JsonConverter.Product newProduct) {
        return productDao.updateProductByName(name, newProduct);
    }

}
