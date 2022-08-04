package chapter2;

public class Practice {
	
	public static void main(String[] args) {
		int[][] score = new int[5][3];
		
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score[i].length;j++) {
				score[i][j] = 10;
			}
		System.out.println(score[0][2]);
		}
	}
}


