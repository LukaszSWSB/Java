package devices;

public class Animal {
    final String species = "Dog";
    private double weight=20;

    public boolean isLife()
    {
        if (this.weight <= 0)
        {
            System.out.println("The animal is dead");
            return false;
        } else {
            System.out.println("The animal is alive");
            return true;
        }
    }
    public Animal () {
if (this.species.equals("Dog"))
        {

            this.weight = 20;
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
}
