package nested.anonymous.ex;

import java.util.Random;

//static nested class
public class Ex1RefMainV4 {

  public static void hello(Process process) {
    System.out.println("start");

    process.run();

    System.out.println("finish");
  }


  public static void main(String[] args) {

    System.out.println("Hello");
    //use lambda
    //Since a lambda can only implement a single-method interface (SAM, Single Abstract Method Interface),
    //it automatically implements Process if it is a functional interface.
    hello(() -> {
      int randomValue = new Random().nextInt(6) + 1;
      System.out.println("dice = " + randomValue);
    });
    hello(new Process() {
      @Override
      public void run() {
        for (int i = 1; i <= 3; i++) {
          System.out.println("i = " + i);
        }
      }
    });
  }
}
