package dp;
import java.util.*;
public class inclexcl {
    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);
        int n =scn.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int incl=arr[0];
        int excl= 0;
        for(int i=1;i<arr.length;i++){
            int nincl=excl+arr[i];
            int nexcl=Math.max(incl,excl);
            excl=nexcl;
            incl=nincl;
   
        }
        System.out.println(Math.max(incl,excl));
       }
}
