package sortingAndSearching;

public class P5a_Sort_0_1_2 {
//one pass
    static void sort012(int [] arr){
        int n = arr.length;
        int l = 0;
        int m = 0;
        int h = n-1;
        while(m<=h){
            if(arr[m] == 0 ) {
                swap(arr,m,l);
                l++;
                m++;
            }
            else if(arr[m]==1){
                m++;
            }else //(arr[m]==2)
            {
                swap(arr,m,h);
                h--;
            }
        }
}
    static void swap(int[] arr, int first , int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second] = temp;
    }
     static void displayArry(int[] arr){
        for(int val : arr){
            System.out.print(val+ " " );
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] nums ={2,1,1,2,2,0,0,1,1,2,2,0,1};
        sort012(nums);
        displayArry(nums);
     }
    
}
