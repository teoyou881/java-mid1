package lang.object.tostring;

public class ToStringMain2 {

  public static void main(String[] args) {
    Car car = new Car("sonata");
    Dog dog1 = new Dog("dog1", 2);
    Dog dog2 = new Dog("dog2", 5);
    System.out.println("1.call toString");
    System.out.println(car.toString());
    System.out.println(dog1.toString());
    System.out.println(dog2.toString());

    System.out.println("2.call toString inside println");
    System.out.println(car);
    System.out.println(dog1);
    System.out.println(dog2);

    System.out.println("3. use Object polymorphism");
    ObjectPrinter.print(car);
    ObjectPrinter.print(dog1);
    ObjectPrinter.print(dog2);
  }
}
