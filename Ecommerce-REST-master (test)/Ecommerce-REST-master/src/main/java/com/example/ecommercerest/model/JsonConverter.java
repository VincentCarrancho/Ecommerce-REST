package com.example.ecommercerest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.json.JsonParseException;


import java.io.File;
import java.io.IOException;

public class JsonConverter {



    public static void main(String args[]) {

        ObjectMapper mapper = new ObjectMapper();
        try {
            File jsonInputFile = new File("C:\\jsonInput.txt");
            Product product = mapper.readValue(jsonInputFile, Product.class);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static class Product {

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

        @Override
        public String toString() {
            return "Product{" +
                    "name= " + name + '\'' +
                    ", desc= " + desc + '\'' +
                    ", price= " + price + '\'' +
                    ", image= " + image + '\'' +
                    '}';
        }


    }
}