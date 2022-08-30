package structires_algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//���� 3273�� Ǯ�ٰ� ����Ž�� ���ͼ� ���� �� ���� ����
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
		Arrays.sort(intarr); //binarySearch ���� Ž�� �����ϱ� ���� ����
		
		for(int i=0; i<n; i++) {
			answer+=Arrays.binarySearch(intarr,(x-intarr[i]))>=0 ? 1:0;
			} // intarr �迭���� (x-intarr[i] -> i�϶� ���ؼ� x���� 0���� ũ�� answer�� 1�� �������)
				// �̶� 0���� ũ�ų� ���ٰ� �ϴ� ������ binarySearch ���� ���� �ε������̱� �����̴�. ������ -������ ����
		
		System.out.println(answer/2); // ������ 2�ϴ� ������ ex) ���� x�� 4�� �� 1+3, 3+1 �ߺ��̱� ������\
		
	}
}