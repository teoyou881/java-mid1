package lang.enumeration.ex;

import static lang.enumeration.ex.ClassGrade.BASIC;
import static lang.enumeration.ex.ClassGrade.DIAMOND;
import static lang.enumeration.ex.ClassGrade.GOLD;

public class EnumMain {

  public static void main(String[] args) {
    int price = 10000;
    Discount discountService = new Discount();
    int basic = discountService.discount(BASIC, price);
    int gold = discountService.discount(GOLD, price);
    int diamond = discountService.discount(DIAMOND, price);
    System.out.println("BASIC grade's discount price: " + basic);
    System.out.println("GOLD grade's discount price: " + gold);
    System.out.println("DIAMOND grade's discount price: " + diamond);
  }
}
