import java.util.Scanner;

/**
 * loop
 */
public class loop {

    public static void main(String[] args) {

//        Scanner scn = new Scanner(System.in);
//        int n = scn.nextInt();
//        for( int i=0; i<=n ; i++)
//        {
//            System.out.println(i);
//        }


//    }
//)
Scanner scn = new Scanner(System.in);
int t= scn.nextInt();
for (int i = 0; i < t; i++) {
    int n = scn.nextInt();
    int count = 0;
    for (int div = 1; div <= n; div++) {
        if (n%div ==0){
            count++;
        }
    }
    if (count==2){
        System.out.println("prime");
    }
    else{
        System.out.println("not prime");
        
    }
    
      }
    }



