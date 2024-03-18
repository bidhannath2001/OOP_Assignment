import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books;
    
    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) { //encapsulation
        this.name = name;
    }
    
    public List<Book> getBooks() {
        return books;
    }
    
    public void setBooks(List<Book> books) {
        this.books = books;
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void removeBook(Book book) {
        books.remove(book);
    }
}
