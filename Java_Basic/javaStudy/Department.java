package javaStudy;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
	Scanner sc = new Scanner(System.in);
	ArrayList<Student> arrList = new ArrayList<>();

	void run() {
		readAll();
		printAll();
	}

	void readAll() {
		Student st = null;
		for (int i = 0; i < 5; i++) {
			st = new Student();
			System.out.println("개인 정보를 입력하세요: ");
			st.read(sc);
			arrList.add(st);
		}
	}

	void printAll() {
		for (Student st1 : arrList) {
			st1.print();
		}
	}

	public static void main(String[] args) {
		Department dp = new Department();
		dp.run();
	}

}
