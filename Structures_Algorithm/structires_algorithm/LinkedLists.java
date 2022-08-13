package structires_algorithm;

import java.util.LinkedList;

public class LinkedLists {

	public static void main(String[] args) {

	LinkedList<String> linkedList = new LinkedList<String>();
	
	/*linkedList.push("A");
	linkedList.push("B");
	linkedList.push("C");
	linkedList.push("D");
	linkedList.push("F");
	linkedList.pop();*/
	
	linkedList.offer("A");
	linkedList.offer("B");
	linkedList.offer("C");
	linkedList.offer("D");
	linkedList.offer("F");
	// linkedList.poll();
	
	linkedList.add(4, "E"); 
	linkedList.remove("E");
	System.out.println(linkedList.indexOf("F")); // F의 index값 출력
	
	System.out.println(linkedList.peekFirst()); // 노드 처음 값
	System.out.println(linkedList.peekLast());  // 노드 마지막 값
	
	linkedList.addFirst("0"); // 처음 노드에 값 추가
	linkedList.addLast("G");  // 마지막 값에 값 추가

	System.out.println(linkedList);
	}

}
