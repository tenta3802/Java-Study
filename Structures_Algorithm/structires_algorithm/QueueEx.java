package structires_algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {

	Queue<String> queue = new LinkedList<String>();
	
	System.out.println(queue.isEmpty()); // ť�� ����ִ���
	
	queue.offer("karen");
	queue.offer("chad");
	queue.offer("steve");
	queue.offer("harold");
	
	System.out.println(queue.size()); // ť ���� Ȯ��
	System.out.println(queue.contains("harold")); // ť�ȿ� ���� �����ϰ� �ִ��� ���� Ȯ��
	
	System.out.println(queue.peek());
	System.out.println(queue);
	
	queue.poll();
	queue.poll();
	queue.poll();
	queue.poll();
	
	System.out.println(queue);
	}
}
//�߰� add() ���� remove() �˻� peek()  ������ ����ó�� �߻�
//�߰� offer() ���� poll() �˻� peek()	�� ���� / ������ false