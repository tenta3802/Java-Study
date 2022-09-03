package baekjoon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
public class Main {
	public static void main(String[] args) {
		String[] participant =  {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		String answer = "";
        
        HashMap<String,Integer> hm = new HashMap<>();
        
        for(int i=0; i<participant.length; i++) {
        	if(hm.containsKey(participant[i])) {
        		int count = (int)hm.get(participant[i]);
        		hm.put(participant[i],count+1);
        	}else {
        		hm.put(participant[i], 1);
        	}
        }
        
        for(int i=0; i<completion.length; i++) {
        	if(hm.containsKey(completion[i])) {
        		int count = (int)hm.get(completion[i]);
        		hm.put(completion[i],count+1);
        	}else {
        		hm.put(completion[i], 1);
        	}
        }
        
       Iterator<String> iter = hm.keySet().iterator();
       
       while(iter.hasNext()) {
    	   String key = iter.next();
    	   if(hm.get(key)%2!=0){
    		   answer += key;
    	   }
       }
       System.out.println(answer);
	}
}