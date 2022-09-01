package baekjoon;

import java.util.Scanner;
public class Main_1009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
        
		for(int i=0; i<n; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			long result = (long)Math.pow(a, b/2);
		
			if(b%2==0) {
				result *= result;
				
			}if(b%2!=0){
				result *= result;
				result *= a;
			}
			if(result%10==0) {
				result = 10;
			}
			
			System.out.println(result);
		}
	}
}