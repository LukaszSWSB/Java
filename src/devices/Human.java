package devices;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import com.sun.jdi.Value;
import creatures.Animal;


public class Human extends Device /*implements Comparable <Car>*/ {
    public Human(int id, String name, double salary) {
        this.id = id;
        this.Name = name;
        this.salary = salary;
    }

    public Human() {
    }
    int id = 0,iD = 0, tmp, a, d, GarageSize, cost = 3000;
    private double salary = 100000;
    public String Name, Name2, NameCar, model, producent, color;
    public boolean created = false;
    double date = 11.05, CostCars;
    int  production_date;
    Animal pet;
    Animal animal = new Animal();
    Random random = new Random();
   /* Car car = new Car();*/
    public ArrayList<Car> garage = new ArrayList();
    public static ArrayList<Human> human = new ArrayList();
    double Cash;
    Scanner scan = new Scanner(System.in);

    public ArrayList<Car> NewGarage(int GarageSize, double CostCars) {
        this.CostCars = CostCars;
        this.GarageSize = GarageSize;
        System.out.println("ID: " + iD);
        System.out.println("Name Car: ");
        NameCar = scan.nextLine();
        System.out.println("Production date: ");
        production_date = scan.nextInt();
        created = true;
        if (created) {
            garage.add(new Car(iD, NameCar, model, producent, color, production_date, cost));
            iD++;
            return garage;
        }
        return garage;
    }


    public ArrayList<Human> NewPerson() {
        System.out.println("ID: " + id);
        System.out.print("Name: ");
        Name = scan.nextLine();
        created = true;
        if (created) {
            LinkedList m = new LinkedList();
            Random generator = new Random();
            int i = random.nextInt(10);
            for(int j=i; j>0; j--) {
                NewGarage(i*10,i*cost);
            }
            System.out.println("Garage size have "+GarageSize + "meters");
            Value();
            human.add(new Human(id, Name, salary));
            id++;
            /*System.out.println(sorted);*/
            //Arrays.sort(garage);
            return human;
        }
        return human;
    }
    /*List<String> sorted = garage.parallelStream().sorted().map((Car) -> getProduction_date(production_date)).collect(Collectors.toList());
    public String getProduction_date(String production_date) {
        return this.production_date = production_date;
    }*/
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
            System.out.println("3. manage money");
            System.out.println("4. manage cars");
            System.out.println("5. Sell");
            System.out.print("Your Choose: ");
            a = scan.nextInt();
            System.out.println();
            switch (a) {
                case 1: {
                    if(salary > 500) {
                        animal.NewAnimal();
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
                    Cash();
                    System.out.println();
                }
                break;
                case 4: {
                    /*Cars();
                    System.out.println();*/
                }
                break;
                case 5: {

                    System.out.println();
                }
                break;
                default: {
                }
                break;
            }
        }while(a !=0);
    }

   /* public void setCar(){
        car.NewCar();
    }

    public void Cars()
    {
        do {
            System.out.println();
            System.out.println("Choose number");
            System.out.println("1. See your dream car");
            System.out.println("2. Buy your dream car");
            System.out.println("3. See your car");
            System.out.println("4. compare two same cars");
            System.out.println("5. ToString");
            System.out.println("0. Back");
            System.out.print("Your Choose: ");
            a = scan.nextInt();
            System.out.println();
            switch (a) {
                case 1: {
                    car.Cars();
                    System.out.println();
                }
                break;
                case 2: {
                    if(salary > car.cost)
                    {
                        System.out.println("You managed to buy the car for cash");
                        setCar();
                    }else if(salary > car.cost/12)
                    {
                        System.out.println("you managed to buy a car on credit");
                        setCar();
                    }else {
                        System.out.println("You don't have cash");
                    }
                    System.out.println();
                }
                break;
                case 3: {
                    car.GetMyCar();
                    System.out.println();
                }
                break;
                case 4: {
                    car.main();
                    System.out.println();
                }
                break;
                case 5: {
                    car.main2();
                    System.out.println();
                }
                break;
                default: {
                }
                break;
            }
        }while(a !=0);
    }*/

    public void Cash()
    {
        do {
            System.out.println();
            System.out.println("Choose number");
            System.out.println("1. Check account balance");
            System.out.println("2. Withdraw from account 500");
            System.out.println("3. Withdraw from account 1500");
            System.out.println("0. Back");
            System.out.print("Your Choose: ");
            d = scan.nextInt();
            System.out.println();
            switch (d) {
                case 1: {
                    getSalary();
                    System.out.println();
                }
                break;
                case 2: {
                    setSalary(500);
                    System.out.println();
                }
                break;
                case 3: {
                    setSalary(1500);
                    System.out.println();
                }
                break;
                default: {
                }
                break;
            }
        }while(d !=0);

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

/*    @Override
    public int compareTo(Car o) {
        return this.production_date.compareTo(o.production_date);
    }*/

    public interface salleable
    {
        void sell(Human seller, Human buyer, Double price);
    }
    @Override
    public void TurnOn() {

    }

    @Override
    public void Value() {
        System.out.println("The entire cost of all cars is "+ CostCars);
    }
}