public class Book extends LibraryItem {
    private String author;
    private boolean available;
  
    public Book(String title, String author) {
      super(title);
      this.author = author;
      this.available = true;
    }
  
    public String getAuthor() {
      return author;
    }
  
    public void setAuthor(String author) {
      this.author = author;
    }
  
    public boolean isAvailable() {
      return available;
    }
  
    public void setAvailable(boolean available) {
      this.available = available;
    }
  
    @Override
    public String toString() {
      return super.toString() + " by " + author + " (" + (available ? "Available" : "Checked Out") + ")";
    }
  }