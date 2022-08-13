package structires_algorithm;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<>();  //Collections.reverseOder()�� �̿��ϸ� ������������ ��� ����
														
		queue.offer("B");
		queue.offer("C");
		queue.offer("A");
		queue.offer("F");
		queue.offer("D");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
