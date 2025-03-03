package nested.local;

public class LocalOuterV2 {

  public void process(int paramVar) {

    class LocalPrinter implements Printer {

      @Override
      public void print() {
        System.out.println("local class can implement just like any class");
      }
    }
    LocalPrinter printer = new LocalPrinter();
    printer.print();
  }

  public static void main(String[] args) {
    LocalOuterV2 localOuter = new LocalOuterV2();
    localOuter.process(2);
  }
}
