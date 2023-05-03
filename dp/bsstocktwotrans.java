package dp;
import java.util.*;
public class bsstocktwotrans {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int lsf=arr[0];
        int mpst=0;
        int[] dpl=new int[arr.length];
        for(int i=1 ;i<arr.length; i++){
            if(arr[i]<lsf){
                lsf=arr[i];
            }
            mpst=arr[i]-lsf;
            if(mpst>dpl[i-1]){
                dpl[i]=mpst;
            }else{
                dpl[i]=dpl[i-1];
            }
        }

        int mpbt=0;
        int maxat=arr[arr.length-1];
        int[] dpr=new int[arr.length];
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>maxat){
                maxat=arr[i];
            }
            mpbt=maxat-arr[i];
            if(mpbt> dpr[i+1]){
                dpr[i]=mpbt;
            }else{
                dpr[i]=dpr[i+1];
            }

        }
       int op=0;
       for(int i=0;i<arr.length;i++){
           if(dpl[i]+dpr[i]>op){
               op=dpl[i]+dpr[i];
           }
       }
           System.out.println(op);
        
    }

}
