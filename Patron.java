import java.util.ArrayList;
import java.util.List;

public class Patron {
    private String name;
    private List<Book> checkedOutBooks;
    
    public Patron(String name) {
        this.name = name;
        this.checkedOutBooks = new ArrayList<>();
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public List<Book> getCheckedOutBooks() {
        return checkedOutBooks;
    }
    
    public void setCheckedOutBooks(List<Book> checkedOutBooks) {
        this.checkedOutBooks = checkedOutBooks;
    }
    
    public void addBook(Book book) {
        checkedOutBooks.add(book);
    }
    
    public void removeBook(Book book) {
        checkedOutBooks.remove(book);
    }
}
