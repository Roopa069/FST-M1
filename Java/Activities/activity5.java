// Abstract class Book
abstract class Book {
    // Title of the book
    protected String title;

    // Abstract method to set the title
    public abstract void setTitle(String title);

    // Concrete method to get the title
    public String getTitle() {
        return title;
    }
}

// Class MyBook that extends the abstract class Book
class MyBook extends Book {
    // Implementation of the abstract method setTitle
    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}

// Main class to test the implementation
public class activity5 {
    public static void main(String[] args) {
        // Create an object of MyBook class
        MyBook newNovel = new MyBook();

        // Use the setTitle() method to set the book title
        newNovel.setTitle("The Great Gatsby");

        // Use the getTitle() method to print the name of the book
        System.out.println("The title of the book is: " + newNovel.getTitle());
    }
}