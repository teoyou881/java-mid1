package lang.object;

public class Problem {

  static class Rectangle {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
      this.width = width;
      this.height = height;
    }

    @Override
    public String toString() {
      return "Rectangle" + "width=" + this.width + ", height=" + this.height + "}";
    }

    @Override
    public boolean equals(Object o) {
      if (o == null || getClass() != o.getClass()) {
        return false;
      }

      Rectangle rectangle = (Rectangle) o;
      return width == rectangle.width && height == rectangle.height;
    }
  }

  public static void main(String[] args) {
    Rectangle rect1 = new Rectangle(100, 20);
    Rectangle rect2 = new Rectangle(100, 20);
    System.out.println(rect1);
    System.out.println(rect2);
    System.out.println(rect1 == rect2);
    System.out.println(rect1.equals(rect2));
  }

}
