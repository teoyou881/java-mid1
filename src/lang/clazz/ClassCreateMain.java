package lang.clazz;

import java.lang.reflect.InvocationTargetException;

public class ClassCreateMain {

  //The Class class contains all the information about the class.
  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Class helloClass = Hello.class;
    Class aClass = Class.forName("lang.clazz.Hello");

    Hello hello = (Hello) helloClass.getConstructor().newInstance();
    String result = hello.hello();
    System.out.println("result = " + result);

  }
}
