import accessModifier.AppPublic;

public class outsidePackageAccessModifierPublic {

    public static void main(String[] args) {

        AppPublic obj = new AppPublic();

        System.out.println(
                "Outside package, non-child class: " + obj.str_1
        );

        AppPublicChild obj2 = new AppPublicChild();

        obj2.printFromChildClass();
    }
}

class AppPublicChild extends AppPublic {

    void printFromChildClass() {
 AppPublicChild obj2 = new AppPublicChild();
        System.out.println(
                "Child class: " +obj2. str_1
        );
    }
}