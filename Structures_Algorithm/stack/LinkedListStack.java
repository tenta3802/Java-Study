package stack;

import org.w3c.dom.Node;

public class LinkedListStack {
	private Node top; // 맨 상위 노드의 위치
	private int count; // 스택의 길이

	// 연결리스트 스택의 생성자
	public LinkedListStack(){
	        this.top = null; //최초 스택을 생성할 때 top은 null
	        this.count = 0;  //최초 스택의 길이
	    }

	private class Node {

		private Object data; // 현재 노드의 값
		private Node link; // 현재 노드에 연결된 노드를 가리킨다.

		Node(Object data) {
			this.data = data;
			this.link = null;
		}
	}

	// 스택 노드 삽입
	public Node push(Object item) {

		Node newNode = new Node(item); // 새 노드 생성
		newNode.link = top; // 새 노드의 link는 top을 가리킨다.
		top = newNode; // top은 새 노드가 된다. 즉 top.link는 이전 노드를 가리키고 있다.
		count++;

		return top;
	}

	// 스택 노드 삭제
	public void pop() {

		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			Node temp = top.link; // 임시 노드에 top 이전 노드들을 저장
			temp.data = top.link.data; // 임시노드의 값에 이전 노드의 값을 저장
			top = temp; // 임시노드가 top이 된다.
		}

		count--;
	}

	private boolean isEmpty() {
		return false;
	}
}
