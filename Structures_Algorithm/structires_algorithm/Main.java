package structires_algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<>();
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int old = sc.nextInt();
			String name = sc.next();
			map.put(old, name);
		}
		
		map.forEach((key,value)->{
			System.out.println(key+" "+value);
		});
	}
}