package enumeration.problem1;

public class AuthGradeMain {

  public static void main(String[] args) {

    AuthGuest[] values = AuthGuest.values();
    for (AuthGuest value : values) {
      System.out.println(value.getLevel() + "   " + value.getDes());
    }
  }
}
