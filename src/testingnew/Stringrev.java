package testingnew;

import java.util.Scanner;

public class Stringrev {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first string ");
		String s1=s.next();
		System.out.println("Enter the second string ");
		String s2=s.next();
		String s3 = s1.concat(s2);
		System.out.println(s3);
		int size = s3.length();
		String result = "";
		for(int i=size-1; i>=0; i--){
			result = result + s3.charAt(i);
		}
		
		System.out.println("Reverse is " +result);
	}

}
