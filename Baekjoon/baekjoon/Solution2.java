package baekjoon;

import java.util.ArrayList;
import java.util.Collections;

//프로그래머스 level.1 3진법 뒤집기
public class Solution2 {

	public static void main(String[] args) {
		int answer = 0;
		int n = 9;
		
		ArrayList<Integer> list = new ArrayList();
		
		while (n>0) {
			
			if(n<3) {
				list.add(n%3);
				break;
			}
			
			int na = n % 3;
			list.add(na);
			n /= 3;
		}
		
		Collections.reverse(list);
		
        for(int i=0; i<list.size(); i++){ 
            int p = (int) Math.pow(3, i);
            int to = p * list.get(i);
            answer  += to;
        }
		
		for(int d : list) {
			System.out.print(d+" ");
		}
		System.out.println(answer);
	}
}
