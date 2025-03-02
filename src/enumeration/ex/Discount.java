package enumeration.ex;

public class Discount {

  public int discount(ClassGrade grade, int price) {
    int discountPercent = 0;
    //enum switch 변경 가능
    if (grade == ClassGrade.BASIC) {
      discountPercent = 10;
    } else if (grade == ClassGrade.GOLD) {
      discountPercent = 20;
    } else if (grade == ClassGrade.DIAMOND) {
      discountPercent = 30;
    } else {
      System.out.println("No discount");
    }
    return price * discountPercent / 100;
  }
}
