package com.company;

public class Animal {
    final String species = "Dog";
    private double weight=20;

    public boolean isLife()
    {
        if (this.weight <= 0)
        {
            System.out.println("Zwierze nie zyje");
            return false;
        } else {
            System.out.println("Zwierze zyje");
            return true;
        }
    }
    public Animal () {
if (this.species.equals("Dog"))
        {

            this.weight = 20;
        }
    }
    public void feed()
    {
        double weight1 = 10;
        weight=weight+weight1;
        System.out.println("Waga została zwieszkona o: " + weight1);
        System.out.println(weight);
    }
    public void takeForAWalk()
    {
        if(isLife())
        {
            double weight2 = 10;
            weight=weight-weight2;
            System.out.println("Waga została zmniejszona o: " + weight2);
            System.out.println(weight);
        }
        else
        {
            System.out.println("ZWIERZE RIP");
        }
    }
}
