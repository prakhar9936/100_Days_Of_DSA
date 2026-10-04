import accessModifier.AppPrivateAccessModifier;

public class outsidePackageAccessModifierPrivate {

    public static void main(String[] args) {

        AppPrivateAccessModifier obj =
                new AppPrivateAccessModifier();

        // NOT allowed
        // System.out.println(obj.str_1);

        // NOT allowed
        // obj.printFromClass();

        System.out.println(
                "Private member cannot be accessed from outside class."
        );

        AppPrivateChild obj2 = new AppPrivateChild();

        obj2.printFromChildClass();
    }
}


// Child class of AppPrivateAccessModifier

class AppPrivateChild extends AppPrivateAccessModifier {

    void printFromChildClass() {

        // NOT allowed
        // System.out.println(str_1);

        System.out.println(
                "Private member cannot be accessed by child class."
        );
    }
}