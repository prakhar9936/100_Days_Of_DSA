package array;

public class A_01_maxExample {
    void max(){
        int[] arr = {2,56,6,13,34,73,1};
        int max = arr[0];
        for(int i = 0; i < arr.length;i++){
        if(arr[i] > max){
            max = arr[i];
;
        }
    }
     System.out.println(max);

    }

    public static void main(String[] args) {
        A_01_maxExample obj = new A_01_maxExample();
        obj.max();
        
    }
    
}
