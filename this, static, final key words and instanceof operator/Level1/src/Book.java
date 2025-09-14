public class Book {
   private static String libraryName;
   private final String title;
   private final String author;
   private final String isbn;

   public Book(String title, String author, String isbn) {
       this.title = title;
       this.author = author;
       this.isbn = isbn;
   }

   public static void setLibraryName(String name) {
       libraryName = name;
   }

   public static void displayLibraryName() {
       System.out.println("Library Name: " + libraryName);
   }

   public void displayBookDetails() {
       System.out.println("Title: " + title);
       System.out.println("Author: " + author);
       System.out.println("ISBN: " + isbn);
   }

   public String getTitle() { return title; }
   public String getAuthor() { return author; }
   public String getIsbn() { return isbn; }
}
