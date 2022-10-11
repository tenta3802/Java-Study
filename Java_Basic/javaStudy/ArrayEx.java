package javaStudy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayEx {

	public static void main(String[] args) {
		System.out.println("# 1. Declare and initialize an array");
		int[] scores = {95,100,87,91};
		scores[2] = 90;
		
		System.out.println(scores);
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("\n# 2. Arrays method: toString(), asList()");
		String[] name = {"kim", "na", "back", "ree" };
		List<String> name_list = Arrays.asList(name);
		System.out.println(name_list);
        System.out.println(name_list.get(1));
        // 배열 리스트로 변환
        
        System.out.println("\n# 3. Arrays method: sort(array, Comparator), sort(array, int fromindex, int toindex)");
        Arrays.sort(name);
        System.out.println(Arrays.asList(name));
        //정렬 후 배열 리스트 변환
        
        Arrays.sort(name, Collections.reverseOrder());
        System.out.println(Arrays.asList(name)); //역순 정렬

        Arrays.sort(name, 0, 2);
        System.out.println(Arrays.asList(name));
        
        System.out.println("\n# 4. Arrays method: copyOf, copyOfRange");
        String[] name_copy1 = Arrays.copyOf(name, name.length);
        System.out.println(Arrays.asList(name_copy1));
        String[] name_copy2 = Arrays.copyOfRange(name, 0, 2);
        System.out.println(Arrays.asList(name_copy2));
	}

}
