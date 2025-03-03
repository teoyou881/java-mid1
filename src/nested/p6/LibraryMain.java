package nested.p6;

public class LibraryMain {

  public static void main(String[] args) {
    Library library = new Library(4); // Create a library that can store up to 4 books
    library.addBook("Book 1", "Author 1");
    library.addBook("Book 2", "Author 2");
    library.addBook("Book 3", "Author 3");
    library.addBook("JPA", "Teo");
    library.addBook("One More Thing", "Jobs");
    library.showBooks(); // Display all book information in the library
  }

}
