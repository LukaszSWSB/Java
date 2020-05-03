package com.company;

public class Human {
    public Human() {
        salary = 1000;
    }
    private double salary;
    double date = 11.05;
    Animal pet = new Animal();
    Car car = new Car();

    double getSalary()
    {
        System.out.println("Payment of the day: " + date);
        System.out.println("Value before returning value= " + salary);
        Deposit(100);
        System.out.println("Current Account status= " + salary);
        return salary;
    }
    boolean setSalary(double HowMuch)
    {
        if (salary < HowMuch) {
            System.out.println("You dont have cash");
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
    boolean Deposit(double HowMuch)
    {
        this.salary = salary + HowMuch;
        return true;
    }
}
