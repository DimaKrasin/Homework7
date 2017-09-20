package com.goit.homework;

public class Fruits {

    private Type type;

    public enum Type {Apple,Strawberry,Avocado,Banana,Grapefruit};
    private int ExpirationDate;
    private String DateOfDelivery;
    private double Price;

    Fruits(Type type,int ExpirationDate,String DateOfDelivering,double Price){
        this.type = type;
        this.ExpirationDate = ExpirationDate;
        this.DateOfDelivery = DateOfDelivering;
        this.Price = Price;
    }

    Fruits(Type strawberry){
    }

    public Type getType() {
        return type;
    }

    public int getExpirationDate() {
        return ExpirationDate;
    }

    public String getDateOfDelivery() {
        return DateOfDelivery;
    }

    public double getPrice() {
        return Price;
    }
}
