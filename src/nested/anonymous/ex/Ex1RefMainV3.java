package nested.anonymous.ex;

import java.util.Random;

//static nested class
public class Ex1RefMainV3 {

  public static void hello(Process process) {
    System.out.println("start");

    process.run();

    System.out.println("finish");
  }


  public static void main(String[] args) {

    Process dice = new Process() {

      @Override
      public void run() {
        int randomValue = new Random().nextInt(6) + 1;
        System.out.println("dice = " + randomValue);
      }
    };

    Process sum = new Process() {
      @Override
      public void run() {
        for (int i = 1; i <= 3; i++) {
          System.out.println("i = " + i);
        }
      }
    };

    //In this case, there is no need to store the reference value of the anonymous class in a variable.
    System.out.println("Hello");
    hello(dice);
    hello(sum);
  }
}
