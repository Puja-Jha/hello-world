package testingnew;

import java.util.Scanner;

public class Sort {
	
	public static void Bubblesort(int array[]){
		
		int n=array.length;
		int temp;
		
		
		for(int i=0;i<(n-1);i++){
			for(int j=0;j<(n-i-1);j++){
				
				if(array[j]>array[j+1]){
					
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			
		}
		
		
	}
	
	public static void main(String[]args){
		
		int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 };
		
		for (int i = 0; i < input.length; i++){
			
			System.out.print(input[i] +",");
		}

		Bubblesort(input);
		System.out.println("Arrays after sort");
        for (int i = 0; i < input.length; i++){
			
			System.out.print(input[i] +",");
		}
		
		
	}

}
