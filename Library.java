import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Patron> patrons;
    
    public Library() {
        books = new ArrayList<>();
        authors = new ArrayList<>();
        patrons = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void addAuthor(Author author) {
        authors.add(author);
    }
    
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }
    
    public void checkOutBook(String title, String patronName) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                book.setAvailable(false);
                for (Patron patron : patrons) {
                    if (patron.getName().equals(patronName)) {
                        patron.addBook(book);
                        break;
                    }
                }
                break;
            }
        }
    }
    
    public void returnBook(String title, String patronName) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isAvailable()) {
                book.setAvailable(true);
                for (Patron patron : patrons) {
                    if (patron.getName().equals(patronName)) {
                        patron.removeBook(book);
                        break;
                    }
                }
                break;
            }
        }
    }
    
    public List<Book> searchBooksByAuthor(String authorName) {
        List<Book> booksByAuthor = new ArrayList<>();
        for (Book book : books) {
            for (Author author : authors) {
                if (author.getName().equals(authorName) && book.getAuthor().equals(author.getName())) {
                    booksByAuthor.add(book);
                }
            }
        }
        return booksByAuthor;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
