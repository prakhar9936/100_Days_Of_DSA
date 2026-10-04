

import accessModifier.AppProtectedAccessModifier;

public class outsidePackageAccessModifierProtected {

    public static void main(String[] args) {

        // Non-child class
        AppProtectedAccessModifier obj =
                new AppProtectedAccessModifier();

        // This is NOT allowed:
        // System.out.println(obj.str_1);

        App3 obj3 = new App3();

        obj3.printFromChildClass();
    }
}


// Child class of AppProtectedAccessModifier

class App3 extends AppProtectedAccessModifier {

    void printFromChildClass() {

        System.out.println(
                "Child class: " + str_1
        );
    }
}