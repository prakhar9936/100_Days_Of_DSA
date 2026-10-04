package accessModifier;

public class AppProtectedAccessModifier {

    protected String str_1 = "I am a protected member";

    void printFromClass() {
        System.out.println("Within class: " + str_1);
    }

    public static void main(String[] args) {

        AppProtectedAccessModifier obj =
                new AppProtectedAccessModifier();

        // Accessing protected member within same class
        obj.printFromClass();
        System.out.println("Within class: " + obj.str_1);

        // Accessing protected member from another class
        // in the same package
        App2 obj2 = new App2();
        obj2.printFromOutsideClass();
    }
}

class App2 {

    void printFromOutsideClass() {

        AppProtectedAccessModifier obj =
                new AppProtectedAccessModifier();

        obj.printFromClass();

        System.out.println(
                "Within package, outside class: " + obj.str_1
        );
    }
}