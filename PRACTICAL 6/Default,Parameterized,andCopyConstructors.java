
class Book {

    String title;
    String author;
    double price;

    // No-argument constructor
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Copy constructor
    Book(Book b) {
        title = b.title;
        author = b.author;
        price = b.price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        // Object using no-argument constructor
        Book b1 = new Book();

        // Object using parameterized constructor
        Book b2 = new Book("Java Programming", "James", 500);

        // Object using copy constructor
        Book b3 = new Book(b2);

        System.out.println("Book 1 (No-Argument Constructor):");
        b1.display();

        System.out.println("Book 2 (Parameterized Constructor):");
        b2.display();

        System.out.println("Book 3 (Copy Constructor):");
        b3.display();

        // Modifying copied object
        b3.price = 700;
        b3.title = "Advanced Java";

        System.out.println("After Modifying Copy Object:");

        System.out.println("Original Book (b2):");
        b2.display();

        System.out.println("Copied Book (b3):");
        b3.display();
    }
}
