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
        System.out.println("Model samochodu: "+model);
        System.out.println("Producent samochodu: "+producent);
        System.out.println("Kolor samochodu: "+color);
        System.out.println("Data produkcji samochodu: "+production_date);
        System.out.println("koszt samochodu= "+cost);
    }
}
