package lang.wrapper;

public class WrapperVsPrimitive {

  //Primitive type operations are much, much faster than wrapper classes.
  public static void main(String[] args) {
    int iterations = 1_000_000_000; // Set the number of iterations
    long startTime, endTime;
    long sumPrimitive = 0;
    startTime = System.currentTimeMillis();
    for (int i = 0; i < iterations; i++) {
      sumPrimitive += i;
    }
    endTime = System.currentTimeMillis();
    System.out.println("sumPrimitive = " + sumPrimitive);
    System.out.println("primitive long : " + (endTime - startTime) +
        "ms");
    // 래퍼 클래스 Long 사용
    Long sumWrapper = 0L;
    startTime = System.currentTimeMillis();
    for (int i = 0; i < iterations; i++) {
      sumWrapper += i; //Auto boxing
    }
    endTime = System.currentTimeMillis();
    System.out.println("sumWrapper = " + sumWrapper);
    System.out.println("wrapper class Long : " + (endTime - startTime) + "ms");
  }
}
