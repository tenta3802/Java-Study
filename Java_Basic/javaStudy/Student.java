package javaStudy;

import java.util.Scanner;

public class Student {

	String name;
	int id;
	String phone;
	int year;

	public void read(Scanner sc) {
		id = sc.nextInt();
		name = sc.next();
		phone = sc.next();
		year = sc.nextInt();
	}

	void print() {
		System.out.printf("�й�:%d �̸�:%s ��ȭ��ȣ:%s ����:%d\n", id, name, phone, year);
	}
}
