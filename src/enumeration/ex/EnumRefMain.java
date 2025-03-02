package enumeration.ex;

public class EnumRefMain {

  public static void main(String[] args) {
    System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
    System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
    System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());
    System.out.println("ref BASIC = " + refValue(ClassGrade.BASIC));
    System.out.println("ref GOLD = " + refValue(ClassGrade.GOLD));
    System.out.println("ref DIAMOND = " + refValue(ClassGrade.DIAMOND));
  }

  private static String refValue(Object grade) {
    return Integer.toHexString(System.identityHashCode(grade));
  }
}
