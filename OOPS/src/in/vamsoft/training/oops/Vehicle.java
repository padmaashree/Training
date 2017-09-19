package in.vamsoft.training.oops;

/**
 * .
 * 
 * @author vamsoft
 *
 */
public abstract class Vehicle implements Driving {

  /**
   * Vehicle constructor.
   */
  public Vehicle() {
    System.out.println("Vehicle.Vehicle()");
  }

  @Override
  public abstract void start();

  @Override
  public abstract void stop();

  @Override
  public abstract void brake();
}
