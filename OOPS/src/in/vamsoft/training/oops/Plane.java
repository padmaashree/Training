package in.vamsoft.training.oops;

public class Plane extends Vehicle implements Flying {
  /**
   * Plane constructor.
   */
  public Plane() {
    System.out.println("Plane.Plane()");
  }
  @Override
  public void landing() {
    System.out.println("landing");
    
  }
  @Override
  public void start() {
    System.out.println("plane.start");
    
  }
  @Override
  public void stop() {
    System.out.println("plane.stop");
    
  }
  @Override
  public void takeoff() {
    System.out.println("takeoff"); 
  }  

  @Override
  public void brake() {
    System.out.println("plane brake");

  }

}
