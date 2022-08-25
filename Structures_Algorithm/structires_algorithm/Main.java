package structires_algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
        String[] temp = {"a","b","c"};
        List<String> list = new ArrayList<>(Arrays.asList(temp));
        // Arrays.asList(temp); 만 해주면 Primitive Stream 값들을 Wrapper Class로
        // 바꾸어 주지 않기 때문에 값 추가나 삭제 등 할 수 없다.
        // 그래서 ArrayList로 인한 변환을 해줘야 한다.
        
        List<String> list2 = new  ArrayList<>();
        String[] temp2 = list2.toArray(new String[list2.size()]);
        
        int[] arr = {1123, 12313, 3122, 34, 43};
        List<Integer> inlist = Arrays.stream(arr).boxed().collect(Collectors.toList());
        //boxed() 메소드는 위의 ArrayList 와 마찬가지로 primitive를 wrapper 로 바꿔줌
        // collect(Collectors.toList())는 stream을 List로 변경
        
        List<Integer> integer2 = new ArrayList<>();
        int[] arr2 = integer2.stream().mapToInt(i->i).toArray();
        
        
    }
}
