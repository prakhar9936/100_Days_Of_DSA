package sortingAndSearching;

import java.util.Scanner;

public class Searching_P2_RoundOff {
    // x = 4 --> o/p 2    (sq.root(4)--> 2 and sq.root(24) --> 4.86 who arround off is 4
    //x = 24 --> o/p 4
    //approach:1 tc:(sq.root(x))
    static int squareRootRoundOff(int x){
        int  y = 0;
        while(y*y  <= x){
            y++;
        }
        return y-1;
    }
    //approach:2 by binary Search  tc:o(logn)
    static int squareRootRoundOffByBinarySearch(int x){
        int st = 0 , end = x;
        int ans = -1;
        while(st<=end){
            int mid = st+(end - st)/2;
            int val = mid*mid;
            if(val == x){
                return mid;
            }else if(val<x){
                ans = mid;
                st = mid+1;

            }else {
                end = mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter element :");
        int x = sc.nextInt();
        System.out.println("approach1: "+squareRootRoundOff(x));


        System.out.println("approach2: "+squareRootRoundOffByBinarySearch(x));

        
    }
    
}
