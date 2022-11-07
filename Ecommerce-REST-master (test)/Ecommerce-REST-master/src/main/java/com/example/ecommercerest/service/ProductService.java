package com.example.ecommercerest.service;

import com.example.ecommercerest.dao.ProductDao;
import com.example.ecommercerest.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductDao productDao;

    @Autowired
    public ProductService(@Qualifier("Dao") ProductDao productDao) {

        this.productDao = productDao;

    }

    public int addProduct(Product product) {

        return productDao.insertProduct(product);

    }

}
