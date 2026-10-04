package accessModifier;

public class AppPublic {

    public String str_1 = "I am a public member";

    void printFromClass() {
        System.out.println("Within class: " + str_1);
    }

    public static void main(String[] args) {

        AppPublic obj = new AppPublic();

        // Accessing public member within same class
        obj.printFromClass();
        System.out.println("Within class: " + obj.str_1);

        // Accessing public member from another class
        // in the same package
        AppPublic2 obj2 = new AppPublic2();
        obj2.printFromOutsideClass();
    }
}

class AppPublic2 {

    void printFromOutsideClass() {

        AppPublic obj = new AppPublic();

        obj.printFromClass();

        System.out.println(
                "Within package, outside class: " + obj.str_1
        );
    }
}