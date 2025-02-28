package lang.String.builder;

public class StringBuilderMain {

  public static void main(String[] args) {

    //A StringBuilder can add, delete, and modify text without creating a new object each time.
    //This helps reduce memory usage and improve performance. However, be careful of side effects.
    StringBuilder sb = new StringBuilder();
    sb.append("A");
    sb.append("B");
    sb.append("C");
    sb.append("D");
    System.out.println("sb = " + sb);
    sb.insert(4, "Java");
    System.out.println("insert = " + sb);
    sb.delete(4, 8);
    System.out.println("delete = " + sb);
    sb.reverse();
    System.out.println("reverse = " + sb);
    //StringBuilder -> String
    String string = sb.toString();
    System.out.println("string = " + string);
  }
}
