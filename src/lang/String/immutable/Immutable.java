package lang.String.immutable;

public class Immutable {

  public static void main(String[] args) {

    //Why Strings are designed to be immutable

    //In Java, the String class optimizes memory usage through a string pool.
    // If the value of a String could be changed,
    // it would cause a problem where all variables referencing the same string in the pool would be modified together.
    String str1 = "hello";
    String str2 = str1.concat(" java");
    System.out.println("str1 = " + str1);
    System.out.println("str2 = " + str2);
  }
}
