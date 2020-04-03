package Examples.vehicles;

public abstract class Vehicle {
  protected int speed;  //mph
  protected int weight; //lbs
  protected int capacity;
  protected int tank;
  protected double mpg;

  public Vehicle(int speed, int weight, int capacity, int tank, double mpg) {
    this.speed = speed;
    this.weight = weight;
    this.capacity = capacity;
    this.tank = tank;
    this.mpg = mpg;
  }

  public abstract double mileage();

  public String print() {
    return "Speed: " + speed +
        "\nWeight: " + weight +
        "\nCapacity: " + capacity;
  }

  public static void main(String[] args) {
    Sedan honda = new Sedan(120, 2000, 4, 4, 12, 20.4, "Civic");
    Truck ford = new Truck(90, 400, 3, 4, 20, 13, "F-150");
    Airplane boeing = new Airplane(575, 175000, 162, 4755, 69, 2, 6, 2);
    Boat speedboat = new Boat(90, 8000, 6, 100, 4, 1, false);

    System.out.println("Vehicle ----- Mileage");
    System.out.println("Honda Civic: " +  honda.mileage());
    System.out.println("Ford F-150: " + ford.mileage());
    System.out.println("Boeing 737: " + boeing.mileage());
    System.out.println("Speed Boat: " + speedboat.mileage());
  }
}
