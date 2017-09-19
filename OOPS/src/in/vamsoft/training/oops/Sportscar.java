package in.vamsoft.training.oops;

/**
 * 
 * 
 * @author vamsoft
 *
 */
public class Sportscar extends Car {

  /**
   * Sportscar constructor.
   */
  public Sportscar() {
    System.out.println("Sportscar.Sportscar()");
  }

  @Override
  public void brake() {
    System.out.println("brake");

  }

  @Override
  public void stop() {
    System.out.println("stop");

  }

  @Override
  public void start() {
    System.out.println("start updated");
  }

}
