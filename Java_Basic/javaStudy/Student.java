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
		System.out.printf("학번:%d 이름:%s 전화번호:%s 나이:%d\n", id, name, phone, year);
	}
}
