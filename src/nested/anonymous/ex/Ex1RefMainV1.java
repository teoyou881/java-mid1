package nested.anonymous.ex;

import java.util.Random;

//static nested class
public class Ex1RefMainV1 {

  public static void hello(Process process) {
    System.out.println("start");

    process.run();

    System.out.println("finish");
  }

  static class Dice implements Process {

    @Override
    public void run() {
      int randomValue = new Random().nextInt(6) + 1;
      System.out.println("dice = " + randomValue);
    }
  }

  static class Sum implements Process {

    @Override
    public void run() {
      for (int i = 1; i <= 3; i++) {
        System.out.println("i = " + i);
      }
    }
  }

  public static void main(String[] args) {
    Process dice = new Dice();
    Process sum = new Sum();
    System.out.println("Hello");
    hello(dice);
    hello(sum);
  }
}
