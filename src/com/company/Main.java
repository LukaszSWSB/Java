package com.company;

import devices.Animal;
import devices.Car;
import devices.Device;
import devices.Human;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        Animal animal = new Animal();
        Car car = new Car();
        Human human = new Human();
        Human human1 = new Human();
        do {
            System.out.println("Choose number");
            System.out.println("1. Feeder");
            System.out.println("2. TakeForAWalk");
            System.out.println("3. Check account balance");
            System.out.println("4. Withdraw from account 500");
            System.out.println("5. Withdraw from account 1500");
            System.out.println("6. See your dream car");
            System.out.println("7. Buy your dream car");
            System.out.println("8. See your car");
            System.out.println("9. porównaj dwa takie same auta");
            System.out.println("10. ToString");
            System.out.print("Your Choose: ");
            a = scan.nextInt();
            System.out.println();
            switch (a) {
                case 1: {
                    animal.feed();
                    System.out.println();
                }
                break;
                case 2: {
                    animal.takeForAWalk();
                    if (animal.isLife() == false)
                    { a = 0; }
                    System.out.println();
                }
                break;
                case 3: {
                    human.getSalary();
                    System.out.println();
                }
                break;
                case 4: {
                    human.setSalary(500);
                    System.out.println();
                }
                break;
                case 5: {
                    human.setSalary(15000);
                    System.out.println();
                }
                break;
                case 6: {
                    human.getCar();
                    System.out.println();
                }
                break;
                case 7: {
                    human.setCar();
                    System.out.println();
                }
                break;
                case 8: {
                    human.getMyCar();
                    System.out.println();
                }
                break;
                case 9: {
                    car.main();
                    System.out.println();
                }
                break;
                case 10: {
                    car.main2();
                    System.out.println();
                }
                break;
                default: {
                    System.out.println("default");
                }
                break;
            }
        }while (a != 0) ;
    }
}
