package lang.object.poly;

public class ObjectPolyExample2 {

  public static void main(String[] args) {
    Dog dog = new Dog();
    Car car = new Car();
    Object object = new Object();
    Object[] objects = {dog, car, object};
    size(objects);
  }

  //Object can hold objects of any type. So by creating an Object[],
  //you can create an array that can hold all the objects in the world.
  private static void size(Object[] objects) {
    System.out.println("The number of length is : " + objects.length);
  }

}
