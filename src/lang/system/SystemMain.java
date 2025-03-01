package lang.system;

import java.util.Arrays;

public class SystemMain {

  public static void main(String[] args) {
    // Get the current time in milliseconds.
    long currentTimeMillis = System.currentTimeMillis();
    System.out.println("currentTimeMillis: " + currentTimeMillis);

    // Get the current time in nanoseconds.
    long currentTimeNano = System.nanoTime();
    System.out.println("currentTimeNano: " + currentTimeNano);

    // Read environment variables.
    System.out.println("getenv = " + System.getenv());

    // Read system properties.
    System.out.println("properties = " + System.getProperties());
    System.out.println("Java version: " + System.getProperty("java.version"));

    // Copy an array quickly.
    char[] originalArray = new char[]{'h', 'e', 'l', 'l', 'o'};
    char[] copiedArray = new char[5];
    // src: Source array containing the data to be copied
    // srcPos: Start index in the source array from where copying begins
    // dest: Destination array where the copied data will be stored
    // destPos: Start index in the destination array where the data will be placed
    // length: Number of elements to copy from the source array to the destination array

    System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

    // Print the array.
    System.out.println("copiedArray = " + copiedArray);
    //[C@506e1b77 => [: array   C:char   @~~~~: hashcode
    System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

    // Terminate the program.
    System.exit(0);

    
  }

}
