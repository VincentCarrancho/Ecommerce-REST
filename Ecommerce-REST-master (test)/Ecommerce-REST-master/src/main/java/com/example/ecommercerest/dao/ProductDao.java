package com.example.ecommercerest.dao;

import com.example.ecommercerest.model.JsonConverter;



import java.util.List;
import java.util.Optional;

public interface ProductDao {

    int insertProduct(JsonConverter.Product product);

    List<JsonConverter.Product> selectAllProducts();

    Optional<JsonConverter.Product> selectProductByName(String name);

    int deleteProductByName(String name);

    int updateProductByName(String name, JsonConverter.Product product);

}
