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
	
	//���� �Ȱ����� alpha�� ��Ƽ� ����� �� ���
	//for�� ���� �������� �޸� ���� �߻� ������(���Ҷ� ���� ���ο� ��ü ����)
	//StringBuilder�� ���� ���ڿ� �߰��� �� ȿ�����̴�.
	}	
}
