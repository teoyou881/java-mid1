package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main {

  public static void helloDice() {
    System.out.println("Program start");
    // Code block start
    int randomValue = new Random().nextInt(6) + 1;
    System.out.println("Dice = " + randomValue);
    // Code block end
    System.out.println("Program end");
  }

  public static void helloSum() {
    System.out.println("Program start");
    // Code block start
    for (int i = 1; i <= 3; i++) {
      System.out.println("i = " + i);
    }
    // Code block end
    System.out.println("Program end");
  }

  public static void hello(String str) {
    System.out.println("Program start");
    if (str.equals("Dice")) {
      int randomValue = new Random().nextInt(6) + 1;
      System.out.println("Dice = " + randomValue);
    } else if (str.equals("Sum")) {
      for (int i = 1; i <= 3; i++) {
        System.out.println("i = " + i);
      }
    } else {
      return;
    }
    System.out.println("Program end");
  }

  public static void main(String[] args) {
    helloDice();
    helloSum();
    System.out.println("-------------------------");
    hello("Dice");
    hello("Sum");
    hello("nfskefsf");
  }
}