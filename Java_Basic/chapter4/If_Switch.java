package chapter4;

import java.util.Scanner;

public class If_Switch {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num==1) {
			System.out.println("sk");
		}else if(num==2){
			System.out.println("kia");
		}else if(num==3){
			System.out.println("necksen");
		}else {
			System.out.println("samsung");
		}
		
		switch(num) {
		case 1:
			System.out.println("sk");
			break;
		case 2:
			System.out.println("kia");
			break;
		case 3:
			System.out.println("necksen");
			break;
		case 4:
			System.out.println("samsung");
			break;
		default:
			System.out.println("kakao");

		}
	}
}