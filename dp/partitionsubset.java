package dp;
import java.util.*;
public class partitionsubset {
    public static long partitionKSubset(int n, int k) {
        if(n==0 || k==0 || n<k){
            return 0;
        }
        long[][] dp=new long[k+1][n+1];
        for(int t=1;t<=k;t++){
            for(int p=1;p<=n;p++){
                if(p<t){
                    dp[t][p]=0;
                }else if(t==p){
                    dp[t][p]=1;
                }else{
                    dp[t][p]=dp[t-1][n-1]+dp[t][p-1]*t;
                }
            }
        }
        long ans=dp[k][n];
        return ans;

    
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        
        long res = partitionKSubset(n, k);
        System.out.println(res);
    }
}
