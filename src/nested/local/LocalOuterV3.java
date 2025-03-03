package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

  private int outInstanceVar = 3;

  public Printer process(int paramVar) {
    int localVar = 1; // Local variables are removed when the stack frame ends.

    class LocalPrinter implements Printer {

      int value = 0;

      @Override
      public void print() {
        System.out.println("value=" + value);
        // The instance survives longer than the local variable.
        System.out.println("localVar=" + localVar);
        System.out.println("paramVar=" + paramVar);
        System.out.println("outInstanceVar=" + outInstanceVar);
      }
    }

    Printer printer = new LocalPrinter();
    // The printer.print() method is not executed here, only the Printer instance is returned.
    return printer;
  }

  public static void main(String[] args) {
    LocalOuterV3 localOuter = new LocalOuterV3();
    Printer printer = localOuter.process(2);
    // printer.print() is executed later, after the process() stack frame has disappeared.
    printer.print();

    System.out.println("fields");
    Field[] declaredFields = printer.getClass().getDeclaredFields();
    for (Field declaredField : declaredFields) {
      System.out.println("declaredField = " + declaredField);
    }
  }
}
