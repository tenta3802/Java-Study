package javaStudy;

public class StringBuilderEx {
	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder();
	String alpha = "";
	
	for(int i='a'; i<='z'; i++) {
		alpha += (char)i;
		}
	
	for(int i='a'; i<='z'; i++) {
		sb.append((char)i);
		}
	
	System.out.println(sb);
	System.out.println(alpha);
	
	//값은 똑같지만 alpha에 담아서 출력을 할 경우
	//for문 동작 과정에서 메모리 낭비가 발생 함으로(더할때 마다 새로운 객체 생성)
	//StringBuilder를 통한 문자열 추가가 더 효율적이다.
	}	
}
