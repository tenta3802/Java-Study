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
		System.out.println("�ڱ�Ұ� ����");
		inputInfo();
		System.out.printf("�̸�:%s, Id:%d\n", name, old);
	}
	
	void inputInfo() {
		System.out.print("�̸��� ���̸� �Է��ϼ���: ");
		name = sc.next();
		this.old = sc.nextInt();
	}
}
