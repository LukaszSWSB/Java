package devices;

import devices.Human.salleable;

import java.util.Scanner;

public class Phone extends Device implements salleable {
    int a;
    Scanner scan = new Scanner(System.in);
    @Override
    public void TurnOn() {
        do {
            System.out.println();
            System.out.println("Choose number");
            System.out.println("1. See your dream car");
            System.out.println("0. Back");
            System.out.print("Your Choose: ");
            a = scan.nextInt();
            System.out.println();
            switch (a) {
                case 1: {

                    System.out.println();
                }
                break;
                default: {
                }
                break;
            }
        }while(a !=0);
    }

    @Override
    public void Value() {

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }
}
