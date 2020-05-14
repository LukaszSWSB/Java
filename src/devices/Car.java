package devices;

public class Car extends Device{
    final String model = "718 Cayman GT4";
    final String producent = "Porsche";
    final String color = "Gold";
    final String color2 = "Gold";
    int production_date = 2019;
    int cost = 3000;
    int production_date2 = 2019;

    public void Car(String model, String producent, String color, int production_date, int cost)
    {
        model = this.model;
        producent = this.producent;
        color = this.color;
        production_date = this.production_date;
        cost = this.cost;
        System.out.println("Car model: "+model);
        System.out.println("Car manufacturer: "+producent);
        System.out.println("Car color: "+color);
        System.out.println("Car production date: "+production_date);
        System.out.println("the cost of the car= "+cost);
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return cost == car.cost &&
                production_date == car.production_date &&
                color.equals(car.color)&&
                model.equals(car.model)&&
                producent.equals(car.producent);
    }
    public static void main(String... equalsExplanation) {
        System.out.println(new Car().equals(new Car()));
    }
    public static void main2(String... equalsExplanation) {
        Car car1=new Car();
        System.out.println(car1);
    }

    @Override
    public void TurnOn() {

    }
}
