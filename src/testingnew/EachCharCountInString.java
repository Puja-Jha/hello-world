package testingnew;

import java.util.Scanner;

public class EachCharCountInString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the size of array:");

		int sizeofarray = scan.nextInt();
	
		int [] arr = new int[sizeofarray];
		
		System.out.println("Please enter the sum: ");

		int sum = scan.nextInt();
		
		System.out.println("Please enter the elements of an array: \n");
		for(int i=0;i<arr.length;i++){
		
			arr[i] = scan.nextInt();
		}
		
		System.out.println("inside");
		
		for(int i=0;i<(arr.length);i++)
		{
			for(int j=1;j<(arr.length-1);j++)
		{
			
			if(arr[i]+arr[j]==sum){
				
				System.out.println("Subsets of element of array are: " +arr[i] + "," + arr[j]);	
			}
			
			
		}
		
		}
		
	}
}	
		/*System.out.println("Elements of an array are: ");
		for(int i=0;i<arr.length;i++){
			
		
			System.out.println(arr[i]);

		}
		
		
		String str = scan.nextLine();
		
		char[] var =str.toCharArray();
		
		for(char lobo : var){
		
		System.out.println(lobo);
		}*/
		
	


