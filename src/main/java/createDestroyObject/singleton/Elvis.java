package createDestroyObject.singleton;

public class Elvis {

  private static final Elvis instance = new Elvis();

  private Elvis() {

  }
  public static Elvis getInstance() {
    return instance;
  }
}
