package chapter2;

import java.util.Scanner;

public class IntegerParseInt {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		int num = Integer.parseInt(input); // String -> Integer ������ ��ȯ
		
		System.out.println(input.getClass().getName()); //input Ÿ�� Ȯ��
		System.out.println(num+3); // ��ȯ �� �׽�Ʈ
		System.out.println(num+100);

	}

}
