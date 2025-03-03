package nested.p2;

import nested.p2.OuterClass2.InnerClass;

public class OuterClass2Main {

  public static void main(String[] args) {
    OuterClass2 outerClass2 = new OuterClass2();
    InnerClass innerClass = outerClass2.new InnerClass();
    innerClass.hello();
    System.out.println(outerClass2.getX());
  }
}
