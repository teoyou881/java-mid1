package nested.p5;

import nested.p4.Hello;

public class LambdaMain {

  public static void hello(Hello hello) {
    System.out.println("start");

    hello.hello();

    System.out.println("finish");
  }


  public static void main(String[] args) {
    hello(() -> {
      System.out.println("Hello.hello");
    });
  }
}
