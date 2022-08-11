package chapter2;

import java.util.Scanner;

public class IntegerParseInt {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		int num = Integer.parseInt(input); // String -> Integer 값으로 변환
		
		System.out.println(input.getClass().getName()); //input 타입 확인
		System.out.println(num+3); // 변환 후 테스트
		System.out.println(num+100);

	}

}
