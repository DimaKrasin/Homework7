package com.goit.homework;

import com.alibaba.fastjson.JSON;

import java.io.IOException;

public class Maine {

    public static void main(String[] args) throws IOException {

        Store store = new Store();
        //CreateAndAddToFile("files/Postavka.txt");
        //CreateAndAddToFile("files/Postavka.txt");
        store.addFruits("files/Postavka.txt");
        store.show();
    }

    public static void CreateAndAddToFile(String path) throws IOException {
        String JSONFruct = CreateJSONFile(
                Fruits.Type.Avocado, 10, "01/01/01", 77.77);
        UtilsClass.writeToFile(JSONFruct, path);
    }

    public static String CreateJSONFile(
            Fruits.Type fruct, int ExpirationDat, String DateOfDelivery, Double Price) {
        Fruits fruit = new Fruits(fruct, ExpirationDat, DateOfDelivery, Price);
        String json = JSON.toJSONString(fruit);
        return json;
    }

}
