
class ComplexNumber {

    double real;
    double imaginary;

    // Constructor
    ComplexNumber(double r, double i) {
        real = r;
        imaginary = i;
    }

    // Method to add two complex numbers
    ComplexNumber add(ComplexNumber c) {
        double realSum = real + c.real;
        double imaginarySum = imaginary + c.imaginary;

        return new ComplexNumber(realSum, imaginarySum);
    }

    // Method to display complex number
    void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating two complex number objects
        ComplexNumber c1 = new ComplexNumber(5, 3);
        ComplexNumber c2 = new ComplexNumber(4, 2);

        // Adding two complex numbers
        ComplexNumber result = c1.add(c2);

        // Displaying inputs and result
        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();

        System.out.print("Sum of Complex Numbers: ");
        result.display();
    }
}
