package chapter5;

public class ArrayEx {

	public static void main(String[] args) {

			int[] ball = new int[45];  // 45�� �迭 �����
			
			for(int i=0; i<ball.length; i++) //45�� ��ŭ ball �迭�� �ֱ� 1~ 46����
				ball[i] = i+1;
				
			int temp = 0; // temp ���� ����

			for(int i=0; i<10; i++) { 
				// Math.random�� 0~0.9x���� �������� ��ȯ
				int j = (int)(Math.random()*45); //j��� ���� ���� ������(0~44) �ο�
				temp = ball[0]; //ball[0] = 1 �� temp = 1
				ball[0]= ball[j]; // ball[0]�� ���� ball[������] �ֱ�
				ball[j] = temp; // ball[������]�� 1 �ֱ�
			}
			for (int i=0; i<45; i++)
				System.out.print(ball[i]+" ");
		}
	}

