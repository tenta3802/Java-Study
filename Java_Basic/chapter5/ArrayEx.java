package chapter5;

public class ArrayEx {

	public static void main(String[] args) {

			int[] ball = new int[45];  // 45개 배열 만들기
			
			for(int i=0; i<ball.length; i++) //45개 만큼 ball 배열에 넣기 1~ 46까지
				ball[i] = i+1;
				
			int temp = 0; // temp 변수 생성

			for(int i=0; i<10; i++) { 
				// Math.random은 0~0.9x까지 랜덤으로 반환
				int j = (int)(Math.random()*45); //j라는 변수 값에 랜덤값(0~44) 부여
				temp = ball[0]; //ball[0] = 1 즉 temp = 1
				ball[0]= ball[j]; // ball[0]의 값에 ball[랜덤값] 넣기
				ball[j] = temp; // ball[랜덤값]에 1 넣기
			}
			for (int i=0; i<45; i++)
				System.out.print(ball[i]+" ");
		}
	}

