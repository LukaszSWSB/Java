package devices;

public abstract class Device {
    String producer;
    String mode;
    int yearOfProduction;

    Device()
    {
        this.mode = mode;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }
    public abstract void TurnOn();
}
