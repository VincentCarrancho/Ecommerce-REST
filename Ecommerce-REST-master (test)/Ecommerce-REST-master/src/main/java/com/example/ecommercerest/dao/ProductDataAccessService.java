package com.example.ecommercerest.dao;

import com.example.ecommercerest.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("Dao")
public class ProductDataAccessService implements ProductDao{

    private static List<Product> DB = new ArrayList<>();

    @Override
    public int insertProduct(Product product) {

        DB.add(new Product(product.getName(), product.getDesc(), product.getPrice(), product.getImage()));
        return 1;
    }
}
