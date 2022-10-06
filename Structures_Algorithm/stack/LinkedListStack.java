package stack;

import org.w3c.dom.Node;

public class LinkedListStack {
	private Node top; // �� ���� ����� ��ġ
	private int count; // ������ ����

	// ���Ḯ��Ʈ ������ ������
	public LinkedListStack(){
	        this.top = null; //���� ������ ������ �� top�� null
	        this.count = 0;  //���� ������ ����
	    }

	private class Node {

		private Object data; // ���� ����� ��
		private Node link; // ���� ��忡 ����� ��带 ����Ų��.

		Node(Object data) {
			this.data = data;
			this.link = null;
		}
	}

	// ���� ��� ����
	public Node push(Object item) {

		Node newNode = new Node(item); // �� ��� ����
		newNode.link = top; // �� ����� link�� top�� ����Ų��.
		top = newNode; // top�� �� ��尡 �ȴ�. �� top.link�� ���� ��带 ����Ű�� �ִ�.
		count++;

		return top;
	}

	// ���� ��� ����
	public void pop() {

		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			Node temp = top.link; // �ӽ� ��忡 top ���� ������ ����
			temp.data = top.link.data; // �ӽó���� ���� ���� ����� ���� ����
			top = temp; // �ӽó�尡 top�� �ȴ�.
		}

		count--;
	}

	private boolean isEmpty() {
		return false;
	}
}
