package com.goit.homework;

import java.util.Date;

public class Fruits {

    private Type type;
    public enum Type {Apple,Strawberry,Avocado,Banana,Grapefruit};
    private int ExpirationDate;
    private Date DateOfDelivery;
    private double Price;

    Fruits(Type type,int ExpirationDate,Date DateOfDelivering,double Price){
        this.type = type;
        this.ExpirationDate = ExpirationDate;
        this.DateOfDelivery = DateOfDelivering;
        this.Price = Price;
    }

    Fruits(){
    }

    public void setType(Type type) {

        this.type = type;
    }

    public void setExpirationDate(int expirationDate) {
        ExpirationDate = expirationDate;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public Type getType() {
        return type;
    }

    public int getExpirationDate() {
        return ExpirationDate;
    }

    public double getPrice() {
        return Price;
    }

    public Date getDateOfDelivery() {
        return DateOfDelivery;
    }

    public void setDateOfDelivery(Date dateOfDelivery) {
        DateOfDelivery = dateOfDelivery;
    }
}