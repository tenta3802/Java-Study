package structires_algorithm;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		long a = scanner.nextLong();
		long b = scanner.nextLong();
		List<Long> list = new ArrayList<>();
		
		if(a==b) {
			System.out.println(0);
		}else if(a>b) {
			System.out.println(a-b-1);
		}else {
			System.out.println(b-a-1);
		}
		
		if(a>b) {
			for(long i=b+1; i<a; i++) {
				list.add(i);
			}
		}else if(a<b) {
			for(long i=a+1; i<b; i++) {
				list.add(i);
			}
		}
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			if(i==list.size()-1) {
				System.out.print(list.get(i));
			}else {
				System.out.print(list.get(i)+" ");
			}
		}
	}
}