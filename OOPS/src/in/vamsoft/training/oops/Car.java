package in.vamsoft.training.oops;

/**
 * .
 * 
 * @author vamsoft
 *
 */
public abstract class Car extends Vehicle {

  /**
   * Car constructor.
   */
  public Car() {
    System.out.println("Car.Car()");
  }

  @Override
  public void start() {
    System.out.println("start");

  }
  public void handbreak() {
    System.out.println("it works! Handbreak");
  }
}
