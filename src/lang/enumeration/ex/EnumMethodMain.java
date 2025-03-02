package lang.enumeration.ex;

import java.util.Arrays;

public class EnumMethodMain {

  public static void main(String[] args) {
    ClassGrade[] values = ClassGrade.values();
    System.out.println("Arrays.toString(values) = " + Arrays.toString(values));

    // It is best to avoid using the ordinal() value because if the position of a constant is changed,
    // the ordinal values of all constants may shift as well.
    for (ClassGrade value : values) {
      System.out.println("ordinal =" + value.ordinal());
    }
  }
}
