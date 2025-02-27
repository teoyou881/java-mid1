package lang.object.tostring;

public class ObjectPrinter {

  public static void print(Object obj) {
    String string = "class info: " + obj.toString();
    System.out.println(string);
  }
}