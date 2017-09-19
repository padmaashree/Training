package in.vamsoft.hierarchytest;


import in.vamsoft.training.oops.Sportscar;
import in.vamsoft.training.oops.Plane;

/**
 * .
 * 
 * @author vamsoft
 *
 */
public class Test {
  /**
   * 
   * 
   * @param args
   *          passes the arguments passed.
   */
  public static void main(String[] args) {
    System.out.println("Test.main()");
    Sportscar car = new Sportscar();
    car.start();
    car.stop();
    car.brake();
    car.handbreak();
    Plane fly = new Plane();
    fly.brake();
  }
}
