package structires_algorithm;

import java.util.Stack;

public class StackEx {
	public static void main (String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		// System.out.println(stack.empty()); ������ ����ִ��� Ȯ��
	
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		
		// String myNumber = stack.pop(); ���� �� ��ü�� ��� -> ��ü ����ϸ� ���� �� ���
		// System.out.println(stack.peek()); �� ���� �� ��� ���� (pop()�� �����̱� ������ ���̰� ����)
		// System.out.println(stack.search("five")); ������ ���� ���� ������ 1(2,3,4..) ���, �ڷᰡ ������ -1 ���
	
		
		//stack�� �ټ����� �޼ҵ�
		//push(), pop(), peek(), empty(), search()
	}
}
