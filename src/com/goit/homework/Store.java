package com.goit.homework;

import com.alibaba.fastjson.JSON;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Store {

    private static ArrayList<Fruits> fruitsArrayList = new ArrayList();

    public Store(ArrayList<Fruits> fruitsArrayList){
        this.fruitsArrayList = fruitsArrayList;
    }
    public Store(){
    }

    public static void addFruits(String pathToJsonFile) throws IOException {

            BufferedReader r = new BufferedReader(new FileReader(pathToJsonFile));
            String json = r.readLine();
            fruitsArrayList.add(JSON.parseArray(json,));
    }

    public static void show() {
        for (int i = 0; i < Store.fruitsArrayList.size(); i++) {
            System.out.println(Store.fruitsArrayList.get(i).getDateOfDelivery());
        }
    }
}
