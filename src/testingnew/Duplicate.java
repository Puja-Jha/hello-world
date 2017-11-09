package testingnew;

import java.util.HashSet;

public class Duplicate {

	public static void main(String[] args) {
		
		String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
		
		HashSet<String> set= new HashSet<String>();
		
		for(String arrelement:strArray){
			
			if(!set.add(arrelement)){
				
				System.out.print("\nduplicate is: " + arrelement);
			}
		}

	}

}
