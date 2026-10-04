package accessModifier;

public class AppPrivateAccessModifier {

    private String str_1 = "I am a private member";

    private void printFromClass() {
        System.out.println("Within class: " + str_1);
    }

    public static void main(String[] args) {

        AppPrivateAccessModifier obj =
                new AppPrivateAccessModifier();

        // Accessing private member within SAME class
        obj.printFromClass();

        System.out.println(
                "Within class: " + obj.str_1
        );

        // Another class in the same package
        AppPrivate2 obj2 = new AppPrivate2();

        obj2.printFromOutsideClass();
    }
}


// Another class in the SAME package

class AppPrivate2 {

    void printFromOutsideClass() {

        AppPrivateAccessModifier obj =
                new AppPrivateAccessModifier();

        // NOT allowed
        // obj.printFromClass();

        // NOT allowed
        // System.out.println(obj.str_1);

        System.out.println(
                "Private member cannot be accessed from another class."
        );
    }
}