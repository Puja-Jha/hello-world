package testingnew;

import java.util.Scanner;

public class birthdayCakeCandles {
	static int max=0,count=0;
	
	static int birthdayCakeCandles(int n, int[] ar) {
		for(int ar_i = 0; ar_i < n; ar_i++){
			if(ar[ar_i]>max){
				max=ar[ar_i];
			}
		}
		for(int ar_j = 0; ar_j < n; ar_j++){
			if(max==ar[ar_j]){
				count++;
			}
		}
		return count;
    }

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);

	}

}
