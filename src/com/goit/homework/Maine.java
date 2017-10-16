package com.goit.homework;

import com.alibaba.fastjson.JSON;

import java.text.SimpleDateFormat;
import java.util.*;

public class Maine {

    private static String path = "files/Postavka.txt";
    private static String SavePath = "files/InformationAboutStore.txt";

    public static void main(String[] args) throws Exception {

        Store store = new Store();

        for(int i = 0;i<1;i++) {                                 //Создать 'i' поставок по 'numberOfFruits' фрукту
            CreatDelivery(1, path);
            store.addFruits(path);
        }

        store.showArraylis(store.fruitsArrayList);
        //store.save(SavePath);
        //store.load(SavePath);
        //ArrayList<Fruits> arr= store.getSpoiledFruits();
    }


    //Создает 1 поставку с указаным количеством фруктов в ней(Дата поставки рандомная)
    public static void CreatDelivery(int numberOfFruits,String path)throws Exception{

        Date date = new Date();
        date.toInstant();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-'W'ww-u");
        simpleDateFormat.format(date);
        System.out.println("\n"+date+"\n");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {

            }
        };


        Fruits[] fruits = new Fruits[numberOfFruits];
        for(int i =0;i<fruits.length;i++) {
            fruits[i]= new Fruits(Fruits.Type.Avocado, 10, date,Math.random());
        }

        ObjectFruits objectFruits = new ObjectFruits(fruits);
        String json = JSON.toJSONString(objectFruits);
        UtilsClass.writeToFile(json, path);
    }

    //Рандомное число в диапазоне(включительно)
    public static int GetRandom(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
