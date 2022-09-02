package baekjoon;

import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {4,2};
		int[] reserve = {3,5};
		
int answer = n - lost.length;  
        
        Arrays.sort(reserve);
        Arrays.sort(lost);
        
        for(int i=0; i<reserve.length; i++){
            if(Arrays.asList(lost).contains(reserve[i])){
                int a = reserve[i];
                int b = Arrays.asList(lost).indexOf(a);
                reserve[i]=-1;
                lost[b]=-1;
                answer++;
            }
        }
        
        for(int i=0; i<reserve.length; i++){
            for(int j=0; j<lost.length; j++){
                if(lost[j]<0 || reserve[i]<0){
                    continue;
                }else{
                    if(answer==n){ break;}
                    int abs =Math.abs(reserve[i]-lost[j]);
                
                    if(abs==1){
                    reserve[i]=-1;
                    lost[j]=-1;
                    answer++;
                    break;
                    }
                }
            }
        }

        System.out.println(answer);
	}
}