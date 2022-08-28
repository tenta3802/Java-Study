package structires_algorithm;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=n; i>0; i--) {
			for(int l=0; l<n-i; l++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			for(int k=0; k<n-i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=1; i<n; i++) {
			for(int l=1; l<n-i; l++) {
				System.out.print(" ");
			}
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			for(int k=1; k<n-i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}