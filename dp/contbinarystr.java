package dp;
import java.util.*;
public class contbinarystr {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int oczeroes=1;
        int ocones=1;
        for(int i=2;i<=n;i++){
            int nczeroes=ocones;
            int ncones=ocones+oczeroes;
            oczeroes=nczeroes;
            ocones=ncones;
        }
        System.out.println(oczeroes+ocones);
     }
}
