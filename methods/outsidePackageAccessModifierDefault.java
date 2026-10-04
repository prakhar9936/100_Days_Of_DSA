import accessModifier.AppDefaultAccessModifier;

public class outsidePackageAccessModifierDefault {

    public static void main(String[] args) {

        AppDefaultAccessModifier obj =
                new AppDefaultAccessModifier();

        // NOT allowed because str_1 has default access
        // System.out.println(obj.str_1);

        // NOT allowed because printFromClass()
        // also has default access
        // obj.printFromClass();

        System.out.println(
                "Default member cannot be accessed from outside package."
        );

        AppDefaultChild obj2 = new AppDefaultChild();

        obj2.printFromChildClass();
    }
}


// Child class in a DIFFERENT package

class AppDefaultChild extends AppDefaultAccessModifier {

    void printFromChildClass() {

        // NOT allowed
        // System.out.println(str_1);

        System.out.println(
                "Child class in another package cannot access default member."
        );
    }
}