package testingnew;

import java.util.Scanner;

public class superReducedStr {
	
	static String super_reduced_string(String s){
		StringBuilder str=new StringBuilder(s);
    	   for(int i=1;i<str.length();i++){
    		   if(str.charAt(i) == str.charAt(i-1)){
    			  StringBuilder str2= str.delete(i-1, i+1);
    			   i=0;
    		   }
    	   }
    	   if(str.length() == 0){
               System.out.println("Empty String");
           }
    	  /* else
    		   System.out.println(str.toString());*/
    	
	return str.toString();
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
	}

}
