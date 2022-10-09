package baekjoon;

//프로그래머스 level.1 음양더하기
public class Solution {
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<signs.length; i++){
            
            if(signs[i] == false){
                int a = absolutes[i]*-1;
                answer += a;
            }else {
            answer += absolutes[i];
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true,false,true};

		Solution sol = new Solution();
		int a = sol.solution(absolutes, signs);
		System.out.println(a);
		
	}

}