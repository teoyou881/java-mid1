package nested.p6;

//public class Library {
//
//  private final int capacity;
//  private Book[] arr;
//
//  public Library(int capacity) {
//    this.capacity = capacity;
//    arr = new Book[capacity];
//  }
//
//  public void addBook(String name, String author) {
//    int i = 0;
//    for (Book book : arr) {
//
//      if (book == null) {
//        arr[i] = new Book(name, author);
//        return;
//      }
//
//      i++;
//    }
//    System.out.println("The library is running out of storage space..");
//  }
//
//  public void showBooks() {
//    for (Book book : arr) {
//      System.out.println("book = " + book);
//    }
//  }
//
//  static private class Book {
//
//    private final String name;
//    private final String author;
//
//    public Book(String name, String author) {
//      this.name = name;
//      this.author = author;
//    }
//
//    @Override
//    public String toString() {
//      return "Book{" +
//          "name='" + name + '\'' +
//          ", author='" + author + '\'' +
//          '}';
//    }
//  }
//}

//
public class Library {

  private Book[] books;
  private int bookCount;

  public Library(int size) {
    books = new Book[size];
    bookCount = 0;
  }

  public void addBook(String title, String author) {
    if (bookCount < books.length) {
      books[bookCount++] = new Book(title, author);
    } else {
      System.out.println("Library storage is full.");
    }
  }

  public void showBooks() {
    System.out.println("== Book List ==");
    for (int i = 0; i < bookCount; i++) {
      System.out.println(books[i]); // `toString()` automatically called
    }
  }

  private static class Book {

    private final String title;
    private final String author;

    public Book(String title, String author) {
      this.title = title;
      this.author = author;
    }

    @Override
    public String toString() {
      return "Title: " + title + ", Author: " + author;
    }
  }
}
