package creatures;

import devices.Human;
import devices.Human.salleable;

public class Animal implements salleable, Feedable{
    final String species = "Dog";
    private double weight=20;

    public Animal() {

    }

    public boolean isLife()
    {
        if (this.weight <= 0)
        {
            System.out.println("The animal is dead");
            return false;
        } else {
            System.out.println("The animal is alive");
            return true;
        }
    }
    public void feed()
    {
        double weight1 = 10;
        weight=weight+weight1;
        System.out.println("The weight has been increased by: " + weight1);
        System.out.println("Animal weight: " + weight);
    }
    public void takeForAWalk()
    {
        if(isLife())
        {
            double weight2 = 10;
            weight=weight-weight2;
            System.out.println("The weight has been reduced by: " + weight2);
            System.out.println("Animal weight" + weight);
        }
        else
        {
            System.out.println("RIP ANIMAL");
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }

    interface Edbile
    {
        void beEaten();
    }
}
class FarmAnimal extends Animal implements Animal.Edbile {
    public FarmAnimal(String species, double weight) {
        super();
    }

    @Override
    public void beEaten() {

    }
}
class Pet extends Animal
{
    public Pet(String species, double weight) {
        super();
    }
}
interface Feedable
{
    double foodWeight = 10;
    void feed();
}