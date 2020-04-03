package Examples.vehicles;

public class Truck extends Car {

  public Truck(int speed, int weight, int capacity, int wheels, int tank, double mpg, String type){
    super(speed, weight, capacity, tank, mpg, wheels);
    this.type = type;
  }

  @Override
  public double mileage(){
    return tank * (mpg - 2.0);
  }

  public String getType() {
    return type;
  }
}
