public abstract class LibraryItem {
    private String title;
  
    public LibraryItem(String title) {
      this.title = title;
    }
  
    public String getTitle() {
      return title;
    }
  
    public void setTitle(String title) {
      this.title = title;
    }
  
    @Override
    public String toString() {
      return title;
    }
}
