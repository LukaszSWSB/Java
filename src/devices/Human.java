package devices;

import java.util.ArrayList;
import java.util.Scanner;

import creatures.Animal;

import javax.swing.text.Style;

public class Human {
    public Human(int id, String name, double salary) {
        this.id = id;
        this.Name = name;
        this.salary = salary;
    }

    public Human() {
    }

    int id = 0, tmp, a;
    private double salary = 1000;
    public String Name, Name2;
    public boolean created = false;
    double date = 11.05;
    Animal pet;
    Animal animal = new Animal();
    private Car car = new Car();
    public static ArrayList<Human> human = new ArrayList();
    double Cash;
    Scanner scan = new Scanner(System.in);

    public ArrayList<Human> NewPerson() {
        System.out.println("ID: " + id);
        System.out.print("Name: ");
        Name = scan.nextLine();
        created = true;
        if (created) {
            human.add(new Human(id, Name, salary));
            id++;
            return human;
        }
        return human;
    }

    public void Person()
    {
            System.out.println("Your ID:");
            tmp = scan.nextInt();
            System.out.print("Your Name: ");
            Name2 = scan.nextLine();
            if (Name2.equals(human.get(tmp).Name) == false) {
                do {
                    System.out.print("Your Name: ");
                    Name2 = scan.nextLine();
                } while (Name2.equals(human.get(tmp).Name) == false);
                System.out.println("Hello " + human.get(tmp).Name + " " + human.get(tmp).id);
            } else {
                System.out.println("Hello" + human.get(tmp).Name + " " + human.get(tmp).id);
            }
        do {
            System.out.println();
            System.out.println("Choose number");
            System.out.println("1. Buy Animal");
            System.out.println("2. Do something with your pet");
            System.out.println("3. Check account balance");
            System.out.println("4. Withdraw from account 500");
            System.out.println("5. Withdraw from account 1500");
            System.out.println("6. See your dream car");
            System.out.println("7. Buy your dream car");
            System.out.println("8. See your car");
            System.out.println("9. compare two same cars");
            System.out.println("10. ToString");
            System.out.print("Your Choose: ");
            a = scan.nextInt();
            System.out.println();
            switch (a) {
                case 1: {
                    animal.NewAnimal();
                    if(salary > 500) {
                        salary = salary - 500;
                    }else {
                        System.out.println("You don't have cash");
                    }
                    System.out.println();
                }
                break;
                case 2: {
                    animal.MyAnimal();
                    System.out.println();
                }
                break;
                case 3: {
                    getSalary();
                    System.out.println();
                }
                break;
                case 4: {
                    setSalary(500);
                    System.out.println();
                }
                break;
                case 5: {
                    setSalary(15000);
                    System.out.println();
                }
                break;
                case 6: {
                    getCar();
                    System.out.println();
                }
                break;
                case 7: {
                    setCar();
                    System.out.println();
                }
                break;
                case 8: {
                    getMyCar();
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
        }while(a !=0);
    }

    public void getMyCar()
    {
        if (setCar() == 1)
        {
            System.out.println("You have Car:");
            getCar();
        }
        else if(setCar() == 2) {
            System.out.println("You have Car on credit");
            getCar();
        }
        else
        {
            System.out.println("You don't own a car");
        }
    }

    public void getCar()
    {
        car.Car("q","1","1",1,1);
    }

    public int setCar(){
        if (car.cost < salary)
        {
            System.out.println("You managed to buy the car for cash");
            salary = salary - car.cost;
            human.get(tmp).car.Car("1","1","1",1,1);
            return 1;
        }
        else if (car.cost/12 < salary)
        {
            System.out.println("you managed to buy a car on credit");
            human.get(tmp).car.Car("1","1","1",1,1);
            return 2;
        }
        else
        {
            System.out.println("You couldn't buy a car, start earning better");
            return 3;
        }
    }

    public double getSalary() {
        System.out.println("Payment of the day: " + date);
        System.out.println("Value before returning value= " + salary);
        Deposit(100);
        System.out.println("Current Account status= " + salary);
        date = date + 0.01;
        if (date == 11.13) {
            date = date - 1.12;
        }
        return salary;
    }
    public boolean setSalary(double HowMuch)
    {
        if (salary < HowMuch) {
            System.out.println("You don't have cash");
            System.out.println("Current Account status= " + salary);
        }
        else {
            System.out.println("New data has been sent to the accounting system");
            System.out.println("Receive the annex to the contract from Ms. Hania from the staff");
            System.out.println("ZUS and US already know about the change in payout and it makes no sense to hide your income");
            this.salary = salary - HowMuch;
            System.out.println("Current Account status= " + salary);
        }
        return true;
    }
    public boolean Deposit(double HowMuch)
    {
        this.salary = salary + HowMuch;
        return true;
    }
    public interface salleable
    {
        void sell(Human seller, Human buyer, Double price);
    }
}
