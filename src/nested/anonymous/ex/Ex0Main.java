package nested.anonymous.ex;

public class Ex0Main {

  public static void helloJava() {
    System.out.println("start");
    System.out.println("hello java");
    System.out.println("done");
  }

  public static void helloSpring() {
    System.out.println("start");
    System.out.println("hello spring");
    System.out.println("done");
  }

  public static void hello(String string) {
    System.out.println("start");
    System.out.println("hello" + string);
    System.out.println("done");
  }

  public static void main(String[] args) {
    helloJava();
    helloSpring();
    hello("java");
    hello("spring");
  }
}
