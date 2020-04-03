package Examples.vehicles;

public class Sedan extends Car {

  public Sedan(int speed, int weight, int capacity, int wheels, int tank, double mpg, String type){
    super(speed, weight, capacity, tank, mpg, wheels);
    this.type = type;
  }

  @Override
  public double mileage(){
    return tank * (mpg + 1.0);
  }

  public String getType() {
    return type;
  }
}