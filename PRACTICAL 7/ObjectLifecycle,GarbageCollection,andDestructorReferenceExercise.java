
class Student {

    // Constructor
    Student() {
        System.out.println("Object is created.");
    }

    // Method
    void display() {
        System.out.println("Student object is being used.");
    }

    // Finalize method (only for demonstration)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage collector is cleaning the object.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating an object
        Student s = new Student();

        // Using the object
        s.display();

        // Removing the reference
        s = null;

        System.out.println("Object reference removed.");

        // Requesting garbage collection
        System.gc();

        System.out.println("Garbage collection requested.");
    }
}
