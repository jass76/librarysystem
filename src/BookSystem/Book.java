package BookSystem;
public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
}

// Derived class: FictionBook
class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

// Derived class: NonFictionBook
class NonFictionBook extends Book {
    private String topic;

    public NonFictionBook(String title, String author, int year, String topic) {
        super(title, author, year);
        this.topic = topic;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Topic: " + topic);
    }
}

// Derived class: ReferenceBook
class ReferenceBook extends Book {
    private String category;

    public ReferenceBook(String title, String author, int year, String category) {
        super(title, author, year);
        this.category = category;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Category: " + category);
    }
}


