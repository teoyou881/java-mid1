package nested.inner.ex1;

public class Engine {

  private Car car;

  public Engine(Car car) {
    this.car = car;
  }

  public void start() {
    System.out.println("Checking charge level: " + car.getChargeLevel());
    System.out.println("Starting the engine of " + car.getModel() + ".");
  }
}
