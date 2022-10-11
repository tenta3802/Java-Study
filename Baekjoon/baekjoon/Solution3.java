package baekjoon;

import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = { 9, 20, 28, 18, 11 };
		int[] arr2 = { 30, 1, 21, 17, 28 };

		String[] answer = new String[n];
		String[] arr = new String[n];

		Queue<String> s1 = new LinkedList<>();
		Queue<String> s2 = new LinkedList<>();

		for (int b : arr1) {
			while (b > 0) {
				String m = "";
				if (b < 2) {
					m += b;
					s1.add(m);
					System.out.println(m);
				}
				
				int na = b % 2;
				m += na;
				b /= 2;
			}
		}
		
		for (int a : arr2) {
			while (a > 0) {
				String m = "";
				if (a < 2) {
					m += a;
					s1.add(m);
					System.out.println(m);
				}
				int na = a % 2;
				m += na;
				a /= 2;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = "" + s1.poll() + s2.poll();
		}

		for (int i = 0; i < arr.length; i++) {
			String ss = "";
			String[] num = arr[i].split(" ");
			for (String j : num) {
				if (j.equals('0')) {
					ss += " ";
				}
				if (j.equals('1')) {
					ss += '#';
				}
			}
			answer[i] = "#";
		}
		for (int i = 0; i < answer.length; i++) {
			System.out.println(s1.peek());
		}
	}
}
