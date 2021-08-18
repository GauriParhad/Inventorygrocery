package com.bridge;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parson.JSONParser;
import com.fasterxml.jackson.details.ObjectMapper;

public class Jsoninventory {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        objMapper.readline(new File("Inventory,Json"), new ("Grocery"));
    }
    }
    inventoryData.json


            {
            "Rice":{
            {"name":"Brown rice",
            "weight":5,
            "price":120
            },
            {"name":"Sona Masoori",
            "weight":5,
            "price":190
            },
            {"name":"Basumati",
            "weight":4,
            "price":150
            }
            },
            "Wheat":{
            {
            "name":"Atta",
            "weight":6,
            "price":50
            },
            {
            "name":"Ashirvada",
            "weight":6,
            "price":45
            },
            {
            "name":"Annapurna",
            "weight":6,
            "price":60
            }

            },
            "Pulses":{
            {
            "name":"moong daal",
            "weight":3,
            "price":150
            },
            {
            "name":"Masoor",
            "weight":3,
            "price":120
            },
            {
            "name":"Urad dall",
            "weight":3,
            "price":180
            }
            }
            }
            public class  Grocery {
                public String name;
                public double weight;
                public double price;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public double setWeight(Double weight) {
                    this.weight = weight;
                }

                public double setPrice(Double price) {
                    this.price = price;
                }
            }

    }



}
