package References;

// Important: Java is always pass-by-value,
// but when you pass an object,
// the value being copied is the reference to that object.
//  This makes it look like pass-by-reference because the object's fields can be changed.

class Student {

    int marks;

    Student(int marks) {
        this.marks = marks;
    }
}

public class passbyReference {

    void changeValue(Student s) {

        s.marks *= 100;

        System.out.println("Inside: " + s.marks);
    }

    public static void main(String[] args) {

        Student obj = new Student(10);

        System.out.println("Before: " + obj.marks);

        passbyReference p = new passbyReference();

        p.changeValue(obj);

        System.out.println("After: " + obj.marks);
    }
}