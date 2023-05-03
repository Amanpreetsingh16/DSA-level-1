package dp;
import java.util.*;
public class bsstockinf {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn =new Scanner(System.in);
        int n= scn.nextInt();
        int[] price=new int[n];
        for(int i=0;i<price.length;i++){
           price[i]=scn.nextInt();
        }
        int bd=0;
        int sd=0;
        int profit=0;
        for(int i=1;i<price.length;i++){
            if(price[i]>=price[i-1]){
                sd++;
            }else{
             profit+=price[sd]-price[bd];
             bd=sd=i;
            }
          
        }
        profit+=price[sd]-price[bd];
        System.out.println(profit);
    }
}
