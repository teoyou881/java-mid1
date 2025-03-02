package nested.nested;

public class NestedOuter {

  private static int outClassValue = 3;
  private int outInstanceValue = 2;

  static class Nested {

    private int nestedInstanceValue = 1;

    public void print() {
      // Accessing its own member
      System.out.println(nestedInstanceValue);

      // Cannot access the instance members of the outer class
      // System.out.println(outInstanceValue);

      // Can access the class members of the outer class, including private members
      System.out.println(NestedOuter.outClassValue);
    }
  }
}
