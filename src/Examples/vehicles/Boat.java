package Examples.vehicles;

public class Boat extends Vehicle {
  private int motors;
  private boolean sail;

  public Boat(int speed, int weight, int capacity, int tank, double mpg, int motors, boolean sail) {
    super(speed, weight, capacity, tank, mpg);
    this.motors = motors;
    this.sail = sail;
  }

  @Override
  public double mileage() {
    return tank * mpg;
  }

  @Override
  public String print() {
    return super.print() + "\nMotors: " + motors + "\nSail: " + sail;
  }

}
