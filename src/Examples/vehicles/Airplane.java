package Examples.vehicles;

public class Airplane extends Vehicle {
  private int wings;
  private int wheels;
  private int jets;

  public Airplane(int speed, int weight, int capacity, int tank, double mpg, int wings, int wheels,
                  int jets) {
    super(speed, weight, capacity, tank, mpg);
    this.wings = wings;
    this.wheels = wheels;
    this.jets = jets;
  }

  @Override
  public double mileage() {
    return tank * mpg;
  }

  @Override
  public String print() {
    return super.print() + "\nWings: " + wings + "\nWheels: " + wheels  + "\nJets: " + jets;
  }
}
