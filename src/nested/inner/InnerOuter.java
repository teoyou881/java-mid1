package nested.inner;

public class InnerOuter {

  private static int outClassValue = 3;
  private int outInstanceValue = 2;

  class Inner {

    private int innerInstanceValue = 1;

    public void print() {
      // Accessing its own member
      System.out.println(innerInstanceValue);

      // Can access instance members of the outer class, including private members
      System.out.println(outInstanceValue);

      // Can access class (static) members of the outer class, including private members
      System.out.println(InnerOuter.outClassValue);
    }
  }
}
