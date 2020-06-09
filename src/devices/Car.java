package devices;

import creatures.Animal;
import java.util.ArrayList;
import java.util.Scanner;

public class Car extends Device{
    final String model = "718 Cayman GT4";
    final String producent = "Porsche";
    final String color = "Gold";
    final String color2 = "Gold";
    int production_date = 2019;
    int cost = 3000;
    int production_date2 = 2019;
    int Id = 0, tmp;
    public boolean created = false;
    Scanner scan = new Scanner(System.in);
    public static ArrayList<Car> car = new ArrayList();

    public Car() {

    }
    public Car(int Id, String model, String producent, String color, int production_date, int cost)
    {
        this.Id = Id;
        model = this.model;
        producent = this.producent;
        color = this.color;
        production_date = this.production_date;
        cost = this.cost;
    }
    public ArrayList<Car> NewCar() {
        created = true;
        System.out.println(Id);
        System.out.println(model);
        System.out.println(producent);
        System.out.println(color);
        System.out.println(production_date);
        System.out.println(cost);
        if (created) {
            car.add(new Car(Id, model, producent, color, production_date, cost));
            Id++;
            return car;
        }
        return car;
    }
    void GetMyCar() {
        System.out.println();
        for (int i = 0; i < car.size(); i++) {
            System.out.println("ID: " + car.get(i).Id);
            System.out.println("Model: " + car.get(i).model);
            System.out.println("Producent: " + car.get(i).producent);
            System.out.println("Color: " + car.get(i).color);
            System.out.println("Production Date: " + car.get(i).production_date);
            System.out.println("Cost: " + car.get(i).cost);
        }
    }

    void Sell() {

    }

    void Cars()
    {
        System.out.println(Id);
        System.out.println(model);
        System.out.println(producent);
        System.out.println(color);
        System.out.println(production_date);
        System.out.println(cost);
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return cost == car.cost &&
                production_date == car.production_date &&
                color.equals(car.color)&&
                model.equals(car.model)&&
                producent.equals(car.producent);
    }
    public static void main(String... equalsExplanation) {
        System.out.println(new Car().equals(new Car()));
    }
    public static void main2(String... equalsExplanation) {
        Car car1=new Car();
        System.out.println(car1);
    }

    @Override
    public void TurnOn() {

    }
}
