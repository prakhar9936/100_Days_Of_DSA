package sumOfTwo;

public class addno {
    public static void main(String[] args) {
        Algebra obj = new Algebra(5, 7);
        System.out.println("Sum of input numbers is");
        int ans = obj.add();
        System.out.println(ans);
        System.out.println(obj.sub());
        System.out.println(obj.mult());


        Algebra obj2 = new Algebra(7, 9);
        int ans2 = obj2.add();
        System.out.println(ans2);
        System.out.println(obj2.sub());
        System.out.println(obj2.mult());
    }
}