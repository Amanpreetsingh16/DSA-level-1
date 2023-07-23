package graphs;
import java.util.*;
import java.io.*;
public class countisland {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[m][n];
  
        for (int i = 0; i < arr.length; i++) {
           String parts = br.readLine();
           for (int j = 0; j < arr[0].length; j++) {
              arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
           }
        }
       boolean[][] visited=new boolean[arr.length][arr[0].length];
       int count=0;
       for(int i=0; i<arr.length;i++){
          for(int j=0; j<arr[0].length;j++){
             if(arr[i][j]==0 && visited[i][j]==false ){
                drawTreeForComp(arr,i,j,visited);
                count++;
             }
          }
       }
        // write your code here
        System.out.println(count);
     }
     public static void drawTreeForComp(int[][] arr, int i, int j,boolean[][] visited){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==1
        || visited[i][j]==true){
           return;
        }
        visited[i][j]=true;
        drawTreeForComp(arr,i-1,j,visited);
        drawTreeForComp(arr,i,j+1,visited);
        drawTreeForComp(arr,i,j-1,visited);
        drawTreeForComp(arr,i+1,j,visited);
     }
}
