package String;

public class S_07_sumOfSubsetInSubsequemces { 
    //i/p =[2,3,4] o/p: [0,2,3,4,2+3,2+4,3+4,2+3+4] == [0,2,3,4,5,6,7,9]
    static void printSumOfSSQ(int[] num, int n ,int idx,int sum){
        if(idx >= n ){
            System.out.println(sum);
            return;
        }

        //curr idx + sum
    printSumOfSSQ(num, n, idx+1, sum+num[idx]);
        //curr ans
        printSumOfSSQ(num, n, idx+1, sum);
    }
    public static void main(String[] args) {
        int [] num ={2,4,5};
        printSumOfSSQ(num,num.length,0,0);
        
    }
    
}
