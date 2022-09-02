package structires_algorithm;

import java.util.Arrays;
import java.util.Scanner;

// ���α׷��ӽ� level.1 ü���� ���� Greedy Algorithm ����
public class GreedyEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] lost = {2,4};
		int[] reserve = {3};
		int answer = solution(n,lost,reserve);
		System.out.println(answer);
	}

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;  
        
        Arrays.sort(reserve);
        Arrays.sort(lost);
        
        for(int i=0; i<reserve.length; i++){
            for(int j=0; j<lost.length; j++){
                if(reserve[i]==lost[j]){
                    reserve[i]=-1;
                    lost[j]=-1;
                    answer++;
                    break;
                }
            }
        }
        
        for(int i=0; i<reserve.length; i++){
            for(int j=0; j<lost.length; j++){
                int abs =Math.abs(reserve[i]-lost[j]);
            
                if(abs==1){
                reserve[i]=-1;
                lost[j]=-1;
                 answer++;
                break;
                }
            }
        }
        return answer;
    }
}