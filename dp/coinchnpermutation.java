package dp;
import java.util.*;
public class coinchnpermutation {
    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);
        int n=scn.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        int tar=scn.nextInt();
        int[] dp=new int[tar+1];
        dp[0]=1;
        for(int i=1;i<dp.length;i++){
            for(int coin: arr){
                if(coin<=i){
                    int ramt=i-coin;
                    dp[i]+=dp[ramt];
                }
            }
        }
        System.out.println(dp[tar]);
    }
}
