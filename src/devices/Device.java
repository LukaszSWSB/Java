package devices;

public abstract class Device {
    String producer;
    String mode;
    int yearOfProduction;
    Double value;

    Device()
    {
        this.mode = mode;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }
    public abstract void TurnOn();

    public abstract void Value();
}
