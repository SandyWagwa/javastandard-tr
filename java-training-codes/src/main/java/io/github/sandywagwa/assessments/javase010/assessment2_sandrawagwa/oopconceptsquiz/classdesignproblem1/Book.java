//Sandra Wagwa
package io.github.sandywagwa.assessments.javase010.assessment2_sandrawagwa.oopconceptsquiz.classdesignproblem1;

//base class Book
public class Book {

    // Private fields being used in the class
    private String title;
    private String author;
    private String isbn;
    private double price;
    private boolean isAvailable;

    // Constructor using setters for validation
    public Book(String title, String author, String isbn, double price) {
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setPrice(price);
        this.isAvailable = true; // Default availability
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Setters with necessary validations
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("The title cannot be null or empty.");// title should not be empty
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException("The author cannot be null or empty.");// author cannot be empty
        }
        this.author = author;
    }

    public void setIsbn(String isbn) {
        if (isbn == null || !isbn.matches("\\d{13}")) {
            throw new IllegalArgumentException("ISBN must be exactly 13 digits.");// ISN must be exactly 13 digits
        }
        this.isbn = isbn;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");// no negative value in prics
        }
        this.price = price;
    }

    // Business methods
    public void borrowBook() {// borrowBook method
        if (!isAvailable) {
            System.out.println("Book is already borrowed.");// method to borrow a book
        } else {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        }
    }

    public void returnBook() {// returnbook method
        if (isAvailable) {
            System.out.println("Book is already available.");// method to return a book
        } else {
            isAvailable = true;
            System.out.println("Book returned successfully.");
        }
    }

    // toString() method for easy representation and to represent overriding
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", price=" + price +
                ", available=" + isAvailable +
                '}';
    }
}
