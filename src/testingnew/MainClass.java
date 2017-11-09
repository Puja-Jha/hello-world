package testingnew;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String str= scan.nextLine();
		
		char[] chararr= str.toCharArray();
		for(int i=chararr.length-1;i>0;i--){
			System.out.println("The string is " +chararr[i]);
			
		}
	   }

}
