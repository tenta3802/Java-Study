package chapter2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	int n = scanner.nextInt();
    	int[] array = new int[n];
    	int count = 0;
    	int count2 = 0;
    	
    	for(int i=0; i<array.length; i++) {
    		int number = scanner.nextInt();
    		array[i] = number;
    	}
    	
    	for (int i=0; i<array.length; i++) {
			int number2 = array[i];
			if (number2==2) {
				count += 1;
			}
			if (number2 != 1 && number2 != 2) {
	        for(int j=2; j<number2; j++) {
				if (number2%j==0) {
					count2 += 1;
    				}
	        	}
	        if(count2 == 0) {
	        	count += 1;
	        	}
			}
    	}
    	System.out.println(count);
    }
}