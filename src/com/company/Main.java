package com.company;

import creatures.Animal;
import devices.Car;
import devices.Human;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b;
        Scanner scan = new Scanner(System.in);
        Animal animal = new Animal();
        Car car = new Car();
        Human human = new Human();
            do {
                System.out.println("1. Creat Person");
                System.out.println("2. Choose your Person");
                System.out.println("0. System ShutDown");
                System.out.print("Your Choose: ");
                b = scan.nextInt();
                System.out.println();
                switch (b)
                {
                    case 1:
                        {
                        human.NewPerson();
                        System.out.println();
                    }
                    break;
                    case 2: {
                        human.Person();
                        System.out.println();
                    }
                    break;
                    default: {}break;
                }

            }while (b != 0) ;

        }
    }
