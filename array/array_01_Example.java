package array;

public class array_01_Example {
    void demoArray(){
        int[] age = new int[3];
    
        age[0] = 23;
        age[1] = 45;
        age[2] = 56;


        System.out.print(age[0]);
    }
    void sumofArray(){
        int[] ages = {1,2,3,4,5,6};
       int sum = 0;
       for(int i = 0; i < ages.length ;i++){
        sum = sum+ages[i];
       }
       System.out.println(sum);
    }
    public static void main(String[] args) {
        array_01_Example obj = new array_01_Example();
        obj.demoArray();
        
        obj.sumofArray();
        
    }
    
}
