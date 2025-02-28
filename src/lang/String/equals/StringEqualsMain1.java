package lang.String.equals;

public class StringEqualsMain1 {

  public static void main(String[] args) {
    String str1 = new String("hello");
    String str2 = new String("hello");
    System.out.println("new String() == : " + (str1 == str2));
    System.out.println("new String() equals : " + (str1.equals(str2)));
    String str3 = "hello";
    String str4 = "hello";
    System.out.println("리터럴 == : " + (str3 == str4));
    System.out.println("리터럴 equals : " + (str3.equals(str4)));
  }
}