
class Calculator {

    // Method with two integer arguments
    int add(int a, int b) {
        return a + b;
    }

    // Method with three integer arguments
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double arguments
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Addition of two integers: " + c.add(10, 20));

        System.out.println("Addition of three integers: " + c.add(10, 20, 30));

        System.out.println("Addition of two decimal numbers: " + c.add(5.5, 4.5));
    }
}
