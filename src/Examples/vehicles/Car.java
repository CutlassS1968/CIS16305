package Examples.vehicles;

public abstract class Car extends Vehicle {
  protected int wheels;
  protected String type;

  public Car(int speed, int weight, int capacity, int tank, double mpg,  int wheels) {
    super(speed, weight, capacity, tank, mpg);
    this.wheels = wheels;

  }

  @Override
  public String print() {
    return super.print() + "\nWheels: " + wheels + "\nType: " + type;
  }

}
