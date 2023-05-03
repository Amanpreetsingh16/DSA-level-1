package dp;
import java.util.*;
public class bsstocksonetran {
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int n= scn.nextInt();
        int[] price=new int[n];
        for(int i=0;i<price.length;i++){
           price[i]=scn.nextInt();
        }
        int lsf=Integer.MAX_VALUE;
        int op=0;
        int pst=0;
        for(int i=0;i<price.length;i++){
            if(price[i]<lsf){
                lsf=price[i];

            }
             pst=price[i]-lsf;
            if(pst>op){
                op=pst;
            }
        }
        System.out.println(op);
    }

}
