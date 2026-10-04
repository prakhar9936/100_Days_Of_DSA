package sumOfTwo;

public class Algebra {

    int a;
    int b;

    // Default constructor
    Algebra() {
        System.out.println("Constructor of Algebra class called");
    }

    // Parameterized constructor
    Algebra(int x, int y) {
        System.out.println("Constructor of Algebra with parameters called");
        a = x;
        b = y;
    }

    // Add using object's a and b
    int add() {
        return a + b;
    }

    int sub() {
        return a - b;
    }

    int mult() {
        return a * b;
    }
}