package testingnew;

import java.util.Scanner;

public class testarray {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows/columns in matrix : ");
        int n = in.nextInt();
        int a[][] = new int[n][n];
        System.out.println("Enter the elements in matrix :");
        for(int i=0; i < n; i++){
        	for(int j=0; j < n;i++){
        		System.out.println(j);
        	}
        	//System.out.println(i);
        }
		
	}

}
