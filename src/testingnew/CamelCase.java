package testingnew;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count=1;
        String s = in.next();
        for(int i=0;i<s.length();i++){
        	String characs = Character.toString((s.charAt(i)));
        	if(characs==characs.toUpperCase()){
        		count++;
        	}
        }
        System.out.println(count);
	}

}
