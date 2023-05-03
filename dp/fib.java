package dp;

import java.util.*;

public class fib{

public static void main(String[] args) throws Exception {
   // write your code here
    Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int fibn=fibdp(n,new int[n+1]);
        System.out.println(fibn);
    
 }
 public static int fibdp(int n, int[] qb) {
     if(n==0 || n==1){
         return n;
     }
     if(qb[n] !=0){
         return qb[n];
     }
     int fib1=fibdp(n-1,qb);
     int fib2=fibdp(n-2,qb);
     int fibn=fib1+fib2;
     qb[n]=fibn;
     return fibn;
 }

}