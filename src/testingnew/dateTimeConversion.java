package testingnew;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class dateTimeConversion {
	 static String timeConversion(String s) {
		 String myDate = null;
	        DateFormat informat=new SimpleDateFormat("hh:mm:ssaa");
	        DateFormat outFormat = new SimpleDateFormat("HH:mm:ss");
	        Date date = null;
	    	try {
				date=informat.parse(s);
			} catch (ParseException e) {
				e.printStackTrace();
			}
	    	
	    	if( date != null ){
	    		myDate = outFormat.format(date);
	    	}
			return myDate;
	    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);

	}

}
