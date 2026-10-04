package array;

public class A_10_uniqueElementInArray {
    static int uniqueElement(int[] arr ){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = i+1 ;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;                  
                } 
                
            }
           
        }
        int ans = -1;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    
    }
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,2,1,3};
        int ans = uniqueElement(arr);
        System.out.println("The Unique is :"+ ans);
        
    }
    
}
