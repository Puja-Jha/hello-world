package testingnew;

import java.util.Scanner;

public class hackathon {

	public static void main(String[] args) {
		
		float poscount=0,negcount = 0,zerocount=0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int arr_i=0; arr_i < n; arr_i++){
        	if(arr[arr_i]>0){
        		poscount++;
        	}
        	else if(arr[arr_i]<0){
				negcount++;
        	}
        	else if(arr[arr_i]==0){
				zerocount++;
        	}
        }
        
        System.out.println(poscount/n);
        System.out.println(negcount/n);
        System.out.println(zerocount/n);
	}

}
