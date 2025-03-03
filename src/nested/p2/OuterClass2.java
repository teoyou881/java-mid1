package nested.p2;

public class OuterClass2 {

  private final int x = 3;

  public int getX() {
    return x;
  }

  class InnerClass {

    public void hello() {
      System.out.println("InnerClass.hello");
      System.out.println("x = " + x);
    }
  }
}
