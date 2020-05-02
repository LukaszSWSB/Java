package com.company;

public class Animal {
    /*final String species;*/
    private double weight = 20;

    public Animal () {
        double weight = 20;
        this.weight = weight;
    }
    void feed()
    {
        double weight1 = 10;
        double x = this.weight + weight1;
        System.out.println("Waga została zwieszkona o: " + x);
    }
    void takeForAWalk()
    {
        double weight2 = 10;
        if (weight2 < this.weight) {
            double y = this.weight + weight2;
            System.out.println("Waga została zmniejszona o: " + y);
        }
        else
        {
            System.out.println("Zwierze nieżyje");
        }
    }
}
