public static void main(String[] args) {
  Integer i1 = Integer.valueOf(10);
  Integer i2 = Integer.valueOf("10");
  int intValue = Integer.parseInt("10");
  double doubleValue = Double.parseDouble("234.153");
  //비교
  int compareResult = i1.compareTo(20);
  System.out.println("compareResult = " + compareResult);
  //산술 연산
  System.out.println("sum: " + Integer.sum(10, 20));
  System.out.println("min: " + Integer.min(10, 20));
  System.out.println("max: " + Integer.max(10, 20));
}
