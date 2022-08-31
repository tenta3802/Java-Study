package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_11328 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			String str1 = sc.next();
			String str2 = sc.next();
			
			String a ="";
			String b ="";
			
			String[] arr1 = str1.split("");
			String[] arr2 = str2.split("");
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			for(int k=0; k<arr1.length; k++) {
				a += arr1[k]; 
			}
			for(int l=0; l<arr2.length; l++) {
				b += arr2[l]; 
			}
			if(a.equals(b)) {
				System.out.println("Possible");
			}
			else {
				System.out.println("Impossible");
                
			}
		}
	}
}