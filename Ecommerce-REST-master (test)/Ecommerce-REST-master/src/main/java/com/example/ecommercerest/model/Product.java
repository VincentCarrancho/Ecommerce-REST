package com.example.ecommercerest.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Product {

    private final String name;

    private final String desc;

    private final Double price;

    private final String image;


    public Product(@JsonProperty("name") String name,
                   @JsonProperty("desc") String desc,
                   @JsonProperty("price") Double price,
                   @JsonProperty("image") String image) {

        this.name = name;
        this.desc = desc;
        this.price = price;
        this.image = image;

    }


    public String getName() {

        return name;
    }

    public String getDesc() {

        return desc;
    }

    public Double getPrice() {

        return price;
    }

    public String getImage() {

        return image;
    }

}
