package structires_algorithm;

import java.util.Stack;

public class StackEx {
	public static void main (String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		// System.out.println(stack.empty()); 스택이 비어있는지 확인
	
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		
		// String myNumber = stack.pop(); 삭제 값 객체에 담기 -> 객체 출력하면 삭제 값 출력
		// System.out.println(stack.peek()); 맨 위의 값 출력 가능 (pop()은 삭제이기 때문에 차이가 있음)
		// System.out.println(stack.search("five")); 위에서 부터 값이 있으면 1(2,3,4..) 출력, 자료가 없으면 -1 출력
	
		
		//stack의 다섯가지 메소드
		//push(), pop(), peek(), empty(), search()
	}
}
