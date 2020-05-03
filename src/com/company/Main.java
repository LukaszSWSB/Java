package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        Animal animal = new Animal();
        Human human = new Human();
        do {
            System.out.println("Choose number");
            System.out.println("1. Feeder");
            System.out.println("2. TakeForAWalk");
            System.out.println("3. Check account balance");
            System.out.println("4. Withdraw from account 500");
            System.out.println("5. Withdraw from account 1500");
            System.out.print("Your Choose: ");
            a = scan.nextInt();
            switch (a) {
                case 1: {
                    animal.feed();
                }
                break;
                case 2: {
                    animal.takeForAWalk();
                    if (animal.isLife() == false)
                    { a = 0; }
                }
                break;
                case 3: {
                    human.getSalary();
                }
                break;
                case 4: {
                    human.setSalary(500);
                }
                break;
                case 5: {
                    human.setSalary(1500);
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
