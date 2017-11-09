package testingnew;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long sum=0,max=0,min=0;
        long[] diff = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            sum=sum+arr[arr_i];
        }
       for(int arr_j=0; arr_j < 5; arr_j++){
    	   diff[arr_j]=sum-arr[arr_j];
       }
       Arrays.sort(diff);
       System.out.println(diff[0] + " " + diff[diff.length-1]);
	}

}
