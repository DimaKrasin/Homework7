package com.goit.homework;

import com.alibaba.fastjson.JSON;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Store {

    int sizeWhileSaving;

    public ArrayList<ObjectFruits> fruitsArrayList = new ArrayList();

    public  void addFruits(String pathToJsonFile) throws Exception {
            BufferedReader r = new BufferedReader(new FileReader(pathToJsonFile));
            String json = r.readLine();
            fruitsArrayList.add(JSON.parseObject(json,ObjectFruits.class));
            UtilsClass.DeleteAllData("files/Postavka.txt");
    }

    public void showArraylis(ArrayList<ObjectFruits> arr){
        for (int i = 0;i<arr.size();i++){
            Fruits[] fruits = arr.get(i).getArr();
            for (int j = 0;j<fruits.length;j++){

                System.out.println("Тип : "+fruits[j].getType());
                System.out.println("Дата доставки : "+fruits[j].getDateOfDelivery());
                System.out.println("Цена : " +fruits[j].getPrice());
                System.out.println("Срок годности : "+ fruits[j].getExpirationDate());
                System.out.println("\n");
            }
        }
    }

    public void save(String pathToJsonFile)throws Exception{
        UtilsClass.DeleteAllData("files/InformationAboutStore.txt");
        sizeWhileSaving = fruitsArrayList.size();
        for(int i =0;i<fruitsArrayList.size();i++){
            String stringObjectFruit = JSON.toJSONString(fruitsArrayList.get(i));
            UtilsClass.writeToFile(stringObjectFruit,pathToJsonFile);
        }
    }

    public void load(String pathToJsonFile)throws Exception{

        fruitsArrayList.clear();
        System.out.println("sizeWhileSaving:"+ sizeWhileSaving);
        BufferedReader r = new BufferedReader(new FileReader(pathToJsonFile));

        for(int i = 0;i<sizeWhileSaving;i++){
            String json = r.readLine();
            fruitsArrayList.add(JSON.parseObject(json,ObjectFruits.class));
        }
    }
/*
    public ArrayList<Fruits> getSpoiledFruits() throws Exception {

        Date date = new Date();
        date.toInstant();

        ArrayList<Fruits> spoiled = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
        Calendar calendar = Calendar.getInstance();
        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date);

        for (int i = 0;i<fruitsArrayList.size();i++){
            Fruits[] fruits = fruitsArrayList.get(i).getArr();

            for (int j = 0;j<fruits.length;j++){
                Calendar newCalendar = (fruits[j].getDateOfDelivery());
                calendar.setTime(newCalendar);
                calendar.add(Calendar.DAY_OF_MONTH,fruits[j].getExpirationDate());
                if(calendar.getTime().before(calendar1.getTime())){
                    spoiled.add(fruits[j]);
                }
            }
        }
        return spoiled;
    }

    public ArrayList<Fruits> getAvailableFruits(Date date)throws Exception{


        ArrayList<Fruits> SpoiledArr = getSpoiledFruits();
        ArrayList<Fruits> AvaliableFruits;
        for(int i = 0;i<fruitsArrayList.size();i++){
            for (int j=0;j<SpoiledArr.size();j++){
                fruitsArrayList.get(i).equals(SpoiledArr.get(j))? :
            }
        }
    }
    */
}
