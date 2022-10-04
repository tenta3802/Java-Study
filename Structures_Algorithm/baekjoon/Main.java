package baekjoon;

//프로그래머스 level.1 해쉬 예제
public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String s = "a  B   Z";
		int n = 4;
		String answer = "";
        int size = s.length();

        char[] arr = new char[s.length()];

        for(int i=0; i<s.length(); i++){
            arr[i] = s.charAt(i);
        }

        for(int i=0; i<size; i++){
            if(arr[i] == ' ')continue;
            for(int j=1; j<=n; j++){
                if(arr[i] == 'z'){
                    arr[i] = 'a';
                    continue;
                }
                else if(arr[i] == 'Z'){
                    arr[i] = 'A';
                    continue;
                }
                arr[i] = (char)(arr[i] + 1);
            }
        }

        answer = new String(arr);
        
        System.out.println(answer);
	}
}