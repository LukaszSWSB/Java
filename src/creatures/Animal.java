package creatures;

import java.util.ArrayList;
import java.util.Scanner;
import devices.Human;
import devices.Human.salleable;

public class Animal implements salleable, Feedable {
    final String species = "Dog";
    private double weight = 20;
    String Name, speciess, Name2;
    int Id = 0, tmp;
    public boolean created = false;
    Scanner scan = new Scanner(System.in);
    public static ArrayList<Animal> animal = new ArrayList();

    public Animal() {

    }

    public Animal(int Id, String Name, String species, double weight) {
        this.Id = Id;
        this.Name = Name;
        this.speciess = species = "Dog";
        this.weight = weight;
    }

    public ArrayList<Animal> NewAnimal() {
        System.out.println("ID: " + Id);
        System.out.print("Name: ");
        Name = scan.nextLine();
        created = true;
        if (created) {
            animal.add(new Animal(Id, Name, species, weight));
            Id++;
            return animal;
        }
        return animal;
    }

    public void MyAnimal() {
        int c;
        System.out.print("Pet ID:");
        tmp = scan.nextInt();
        System.out.print("Pet Name: ");
        Name2 = scan.nextLine();
        if (Name2.equals(animal.get(tmp).Name) == false) {
            do {
                System.out.print("Pet Name: ");
                Name2 = scan.nextLine();
            } while (Name2.equals(animal.get(tmp).Name) == false);
            System.out.println("Hello my pet " + animal.get(tmp).Name + " " + animal.get(tmp).Id);
        } else {
            System.out.println("Hello my pet " + animal.get(tmp).Name + " " + animal.get(tmp).Id);
        }
        do{
        System.out.println("1. Feeder your pet");
        System.out.println("2. TakeForAWalk whit your pet");
        System.out.print("Your Choose: ");
        c = scan.nextInt();
        System.out.println();

        switch (c) {
            case 1: {
                feed();
                System.out.println();
            }
            break;
            case 2: {
                takeForAWalk();
                if (isLife() == false) {
                    c = 0;
                }
                System.out.println();
            }
            break;
            default: {
                System.out.println("default");
            }
            break;
        }
    }while(c !=0);
}
    public boolean isLife()
    {
        if (this.weight <= 0)
        {
            System.out.println();
            System.out.println("The animal by Name " + Name + " is dead");
            animal.remove(tmp);
            return false;
        } else {
            System.out.println();
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
    //void feed(foodWeight);
}