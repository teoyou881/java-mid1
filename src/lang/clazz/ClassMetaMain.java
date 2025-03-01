package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

  public static void main(String[] args) throws Exception {
    //lookup class
    Class clazz = String.class; //class
    Class clazz1 = new String().getClass(); //instance
    Class clazz2 = Class.forName("java.lang.String"); //string

    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      System.out.println("field = " + field.getType() + "  " + field.getName());
    }

    Method[] methods = clazz.getMethods();
    for (Method method : methods) {
      System.out.println("method = " + method);
    }

    System.out.println("super: " + clazz.getSuperclass().getName());

    Class[] interfaces = clazz.getInterfaces();
    for (Class anInterface : interfaces) {
      System.out.println("anInterface = " + anInterface);
    }
  }
}
