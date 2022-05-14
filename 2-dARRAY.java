// https://nados.io/question/2d-arrays-demo
public class 2-dARRAY {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int [][] Arr=new int [n][m];
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        Arr[i][j]=scn.nextInt();
      }
    }
    for(int i=0;i<Arr.length;i++){
      for(int j=0;j<Arr[j].length;j++){
        System.err.print(Arr[i][j] +" ");
      }
      System.out.println();
    }
}

//https://nados.io/question/matrix-multiplication
public class Main{

    import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn= new Scanner(System.in);
    int r1=scn.nextInt();
    int c1=scn.nextInt();
    int[][] arr1=new int[r1][c1];
    for(int i=0;i<r1;i++){
        for(int j=0; j<c1;j++){
           arr1[i][j]=scn.nextInt();
        }
    }

    int r2=scn.nextInt();
    int c2=scn.nextInt();
    int[][] arr2=new int[r2][c2];
    for(int i=0;i<r2;i++){
        for(int j=0; j<c2;j++){
           arr2[i][j]=scn.nextInt();
        }
    }
    if(c1!= r2){
        System.out.println("Invalid input");
        return;
    }

    int[][] product=new int[r1][c2];
    for(int i=0;i<product.length;i++){
        for(int j=0;j<product[i].length; j++){
             for(int k=0;k< c1;k++){
                 product[i][j]+=arr1[i][k]*arr2[k][j];

             }
        }
    }

     for(int i=0;i<product.length;i++){
        for(int j=0;j<product[i].length; j++){
             System.out.print(product[i][j] + " ");
        }
        System.out.println();
    }
 }

}


    //https://nados.io/question/spiral-display

    import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn= new Scanner(System.in);
      int n=scn.nextInt();
      int m= scn.nextInt();
      int[][] arr=new int[n][m];
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
          arr[i][j]=scn.nextInt();
          
        }
      }
      int minr=0;
      int minc=0;
      int maxr=arr.length-1;
      int maxc=arr[0].length-1;
      int tne =n*m;
      int count=0;
      
      while(count<tne){
        // left wall
        for(int i=minr ,j=minc;i<=maxr && count<tne;i++){
          System.err.println(arr[i][j]);
          count++;
        }
         minc++;

        //bottom wall
        for(int i=maxr ,j=minc;j<=maxc && count<tne;j++){
          System.out.println(arr[i][j]);
          count++;
        }
        maxr--;

        //right wall
        for(int i=maxr ,j=maxc;i>=minr && count<tne;i--){
          System.out.println(arr[i][j]);
          count++;
        }
        maxc--;

        //top wall
        for(int i=minr ,j=maxc;j>=minc && count<tne;j--){
          System.out.println(arr[i][j]);
          count++;
        }
        minr++;
      }
    }

}

// 