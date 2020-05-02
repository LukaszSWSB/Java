package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 0;
        Scanner scan = new Scanner(System.in);
        Animal animal = new Animal();
        do {
            System.out.println("Choose number");
            System.out.println("1. Feeder");
            System.out.println("2. TakeForAWalk");
            System.out.print("Your Choose: ");
            a = scan.nextInt();
            switch (a) {
                case 1: {
                    animal.feed();
                }
                break;
                case 2: {
                    animal.takeForAWalk();
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
