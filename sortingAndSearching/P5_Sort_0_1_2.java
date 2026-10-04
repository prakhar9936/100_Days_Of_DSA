package sortingAndSearching;

import java.util.Arrays;
import java.util.Scanner;
//two pass
public class P5_Sort_0_1_2 {
    static void   sort012(int[] arr){
          int countZero = 0;
            int countOne = 0;
            int countTwo = 0;
        for(int i = 0 ;i< arr.length;i++){
            if(arr[i] == 0){
              countZero++;
            }else  if(arr[i] == 1){
              countOne++;
            }
            else  if(arr[i] == 2){
              countTwo++; 
             
            }

        }
    System.out.println("0 = " + countZero);
    System.out.println("1 = " + countOne);
    System.out.println("2 = " + countTwo);
       int i = 0;
        while(countZero>0) {
            arr[i] = 0;
            countZero--;
            i++;
        }while(countOne>0){
            arr[i]=1;
            countOne--;
            i++;
        }
        while(countTwo>0){
            arr[i] = 2;
            countTwo--;
            i++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+n+"element in form  0 1 2  ");
        for(int i = 0; i< n;i++){
           arr[i] = sc.nextInt();
        }
     System.out.println("Original array: " + Arrays.toString(arr));



        sort012(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
      
    }
    
}
