package accessModifier;

public class AppDefaultAccessModifier {

    String str_1 = "I am a default member";

    void printFromClass() {
        System.out.println("Within class: " + str_1);
    }

    public static void main(String[] args) {

        AppDefaultAccessModifier obj =
                new AppDefaultAccessModifier();

        // Accessing default member within same class
        obj.printFromClass();

        System.out.println(
                "Within class: " + obj.str_1
        );

        // Accessing default member from another class
        // in the same package
        AppDefault2 obj2 = new AppDefault2();

        obj2.printFromOutsideClass();
    }
}


// Another class in the SAME package

class AppDefault2 {

    void printFromOutsideClass() {

        AppDefaultAccessModifier obj =
                new AppDefaultAccessModifier();

        obj.printFromClass();

        System.out.println(
                "Within package, outside class: " + obj.str_1
        );
    }
}