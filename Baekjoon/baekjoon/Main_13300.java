package baekjoon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main_13300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list0 = new ArrayList<>();
		List<Integer> list1 = new ArrayList<>();

		int student = sc.nextInt();
		int room = sc.nextInt();
		
		for(int i=0; i<student; i++) {
			int sex = sc.nextInt();
			int grade = sc.nextInt();

			if(sex==0) {
				list0.add(grade);
			}if(sex==1) {
				list1.add(grade);
			}
		}
		Collections.sort(list0);
		Collections.sort(list1);
        
		int count0 = 0;
		int count1 = 0;
		
		for(int i=1; i<=6; i++) {
			int c = Collections.frequency(list0, i);
			if(c>room) {
				if(c%room==0) {
					count0 += c/room;
				} else {count0 += c/room;
				count0++;
				}
			}
			if(c!=0 && c<=room) {
				count0++;
			}
		}
		
		for(int i=1; i<=6; i++) {
			int c = Collections.frequency(list1, i);
			if(c>room) {
				if(c%room==0) {
					count1 += c/room;
				} else {count1 += c/room;
				count1++;
				}
			}
			if(c!=0 && c<=room) {
				count1++;
			}
		}
		System.out.println(count0+count1);
	}
}