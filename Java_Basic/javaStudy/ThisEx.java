package javaStudy;

import java.util.Scanner;

public class ThisEx {
	String name;
	int old;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ThisEx ex1 = new ThisEx();
		ex1.run();
	}
	
	void run() {
		int old = 0;
		System.out.println("자기소개 시작");
		inputInfo();
		System.out.printf("이름:%s, Id:%d\n", name, old);
	}
	
	void inputInfo() {
		System.out.print("이름과 나이를 입력하세요: ");
		name = sc.next();
		this.old = sc.nextInt();
	}
}
