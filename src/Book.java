public class Book {

    String title, author;
    

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public String toString() {
        return title + " by: " + author;
    }
    public String getTitle(){
        return title;
    }
    
}
