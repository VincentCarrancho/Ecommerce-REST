package com.example.ecommercerest.dao;

import com.example.ecommercerest.model.JsonConverter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository("Dao")
public class ProductDataAccessService implements ProductDao{

    private static List<JsonConverter.Product> DB = new ArrayList<>();

    @Override
    public int insertProduct(JsonConverter.Product product) {

        DB.add(new JsonConverter.Product(product.getName(), product.getDesc(), product.getPrice(), product.getImage()));
        return 1;
    }

    @Override
    public List<JsonConverter.Product> selectAllProducts() {
        return null;
    }

    @Override
    public Optional<JsonConverter.Product> selectProductByName(String name) {
        return DB.stream()
                .filter(product -> product.getName().equals(name))
                .findFirst();
    }

    @Override
    public int deleteProductByName(String name) {
        Optional<JsonConverter.Product> productMaybe = selectProductByName(name);
        if (productMaybe.isEmpty()) {
            return 0;
        }
        DB.remove(productMaybe.get());
        return 1;
    }

    @Override
    public int updateProductByName(String name, JsonConverter.Product update) {
        return selectProductByName(name)
                .map(product -> {
                    int indexOfProductToUpdate = DB.indexOf(product);
                    if (indexOfProductToUpdate >= 0) {
                        DB.set(indexOfProductToUpdate, new JsonConverter.Product(name, update.getDesc(), update.getPrice(), update.getImage()));
                        return 1;
                    }
                    return 0;

                })
                .orElse(0);
    }
}
