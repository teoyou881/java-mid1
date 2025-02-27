package lang.object.poly;

public class ObjectPolyExample1 {

  public static void main(String[] args) {
    Dog dog = new Dog();
    Car car = new Car();
    action(dog);
    action(car);
  }

  //Since we're using the Object type in our code, any object can be upcast to Object,
  //and when we call a method, we access the methods of each class by down casting.
  private static void action(Object obj) {

    //obj.sound(); //Compilation error, Object does not have sound().
    //obj.move(); //Compilation error, Object does not have move().
    //Down casting to the correct type is necessary for the object.
    if (obj instanceof Dog dog) {
      dog.sound();
    } else if (obj instanceof Car car) {
      car.move();
    }
  }
}
