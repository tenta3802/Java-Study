package structires_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//백준 3273번 풀다가 이진탐색 나와서 구현 및 정리 했음
public class BinarySearchEx {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
	
		String[] strarr = bf.readLine().split(" ");
		int[] intarr = new int[n];
		
		for(int i=0; i<n; i++) {
			intarr[i] = Integer.parseInt(strarr[i]);
		}
	
		int x = Integer.parseInt(bf.readLine());
		
		int answer = 0;
		Arrays.sort(intarr); //binarySearch 이진 탐색 구현하기 위해 정렬
		
		for(int i=0; i<n; i++) {
			answer+=Arrays.binarySearch(intarr,(x-intarr[i]))>=0 ? 1:0;
			} // intarr 배열에서 (x-intarr[i] -> i일때 더해서 x값이 0보다 크면 answer에 1을 더해줘라)
				// 이때 0보다 크거나 같다고 하는 이유는 binarySearch 리턴 값이 인데스값이기 때문이다. 없으면 -값으로 리턴
		
		System.out.println(answer/2); // 나누기 2하는 이유는 ex) 합이 x가 4일 때 1+3, 3+1 중복이기 때문에\
		
	}
}