package nested.inner;

import nested.inner.InnerOuter.Inner;

public class InnerOuterMain {

  public static void main(String[] args) {
    InnerOuter outer = new InnerOuter();
    //different way to create instance.
    //A non-static inner class is associated with an instance of the outer class.
    //Therefore, to create an instance of the inner class,
    //an instance of the outer class must be created first.
    //outer.new Inner(); ==>
    //means that the outer instance and the Inner class instance are associated.
    Inner inner1 = outer.new Inner();
  }

}
