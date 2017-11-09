package testingnew;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class diagonalarray {
   static int[] diagonalArray(int n, int ar[][]){
    	 int x=0;
         int y=0;
         int diff=0;
         int array[]=new int[2];
         for(int a_i=0; a_i < n; a_i++){
            	 x=x + ar[a_i][a_i];
             	y=y+ar[a_i][n-a_i-1];
             }
             
         array[0]=x;
         array[1]=y;
		return array;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows/columns in matrix : ");
        int n = in.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter the elements in matrix :");
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
       int x[]= diagonalArray(n, a);
       System.out.println(Math.abs(x[0]-x[1]));
       
    }
    
}
