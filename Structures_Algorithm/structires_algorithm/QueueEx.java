package structires_algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {

	Queue<String> queue = new LinkedList<String>();
	
	System.out.println(queue.isEmpty()); // 큐가 비어있는지
	
	queue.offer("karen");
	queue.offer("chad");
	queue.offer("steve");
	queue.offer("harold");
	
	System.out.println(queue.size()); // 큐 개수 확인
	System.out.println(queue.contains("harold")); // 큐안에 값을 포함하고 있는지 여부 확인
	
	System.out.println(queue.peek());
	System.out.println(queue);
	
	queue.poll();
	queue.poll();
	queue.poll();
	queue.poll();
	
	System.out.println(queue);
	}
}
//추가 add() 삭제 remove() 검사 peek()  오류시 예외처리 발생
//추가 offer() 삭제 poll() 검사 peek()	값 리턴 / 오류시 false