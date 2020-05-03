package com.company;

public class Car {
    final String model = "718 Cayman GT4";
    final String producent = "Porsche";
    final String color = "Gold";
    int production_date = 2019;
    int cost = 3000;

    public void Car()
    {
        String model = this.model;
        String producent = this.producent;
        String color = this.color;
        int production_date = this.production_date;
        int cost = this.cost;
        System.out.println("Car model: "+model);
        System.out.println("Car manufacturer: "+producent);
        System.out.println("Car color: "+color);
        System.out.println("Car production date: "+production_date);
        System.out.println("the cost of the car= "+cost);
    }
}
