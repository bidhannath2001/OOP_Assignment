import java.util.List;

public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();
        // Add books to the library
        library.addBook(new Book("Chitra", "Rabindranath Tagore"));
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        library.addBook(new Book("The Great", "F. Scott Fitzgerald"));
        library.addBook(new Book("Great", "F. Scott Fitzgerald"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("Adventures of Sherlock Holmes", "Sir Arthur Conan Doyle"));
        library.addBook(new Book("Alchemist", "Paulo Coelho"));
        library.addBook(new Book("Anand Math", "Bankim Chandra Chatterjee"));
        library.addBook(new Book("Area of Darkness", "V.S. Naipaul"));
        library.addBook(new Book("As you like it", "William Shakespeare"));
        library.addBook(new Book("Bitter Sweet", "Noel Coward"));
        library.addBook(new Book("1984", "George Orwell"));
        // Add authors to the library
        library.addAuthor(new Author("Rabindranath Tagore"));
        library.addAuthor(new Author("F. Scott Fitzgerald"));
        library.addAuthor(new Author("Harper Lee"));
        library.addAuthor(new Author("Sir Arthur Conan Doyle"));
        library.addAuthor(new Author("Paulo Coelho"));
        library.addAuthor(new Author("Bankim Chandra Chatterjee"));
        library.addAuthor(new Author("V.S. Naipaul"));
        library.addAuthor(new Author("William Shakespeare"));
        library.addAuthor(new Author("Noel Coward"));
        library.addAuthor(new Author("George Orwell"));

        // Add patrons to the library
        library.addPatron(new Patron("John Doe"));
        library.addPatron(new Patron("Jane Doe"));
        // Check out books to patrons
        library.checkOutBook("The Great Gatsby", "John Doe");
        library.checkOutBook("To Kill a Mockingbird", "Jane Doe");

        library.displayBooks();
        // Search for books by author
        List<Book> booksByFitzgerald = library.searchBooksByAuthor("F. Scott Fitzgerald");
        System.out.println("\nBooks by F. Scott Fitzgerald:");
        int c=0;

        for (Book book : booksByFitzgerald) {
            System.out.println(book);
            c=c+1;
        }
        if(c==0){
            System.out.println("Sorry at this momemt we have no books on this author");
        }
    }
}