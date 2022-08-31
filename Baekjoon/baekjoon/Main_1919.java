package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_1919 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		int[] ar = new int[26];
		int[] br = new int[26];
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)>='a' && a.charAt(i)<='z') {
				ar[a.charAt(i)-'a']++;
			}
		}
		for(int i=0; i<b.length(); i++) {
			if(b.charAt(i)>='a' && b.charAt(i)<='z') {
				br[b.charAt(i)-'a']++;
			}
		}

		int count = 0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]!=br[i]) {
				if(ar[i]>br[i]) {
				count += (ar[i]-br[i]);
				}else {
					count += (br[i]-ar[i]);
				}
			}
		}
		System.out.println(count);
	}
}
