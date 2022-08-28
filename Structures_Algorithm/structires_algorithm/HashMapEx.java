package structires_algorithm;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapEx {
	
		
	HashMap<Integer, String> hm = new HashMap<>();
	HashMap<String, String> hm2 = new HashMap<>();

	public <K, V> void put(K key, V value) {
		
	hm.put(1, "사과");
	hm.put(2, "바나나");
	hm.put(3, "포도"); 
	// key 1이 이미 존재하면 key 1의 value가 "포도"로 대체

	hm.remove(1); // key 값으로만 요소 삭제 가능
	hm.clear(); // 전체 삭제

	hm.containsKey(1); // key 값 중 1이 있으면 true, 없으면 false
	hm.containsValue("사과"); // value 중 "사과"가 있으면 true, 없으면 false
	}
	// 값 출력
	// 방법 1
	public <K> void keySet(){
	for (Integer i: hm.keySet()) {
		System.out.println(i + hm.get(i)); // 1 사과
	}
	// 방법 2: key와 value가 모두 필요할 때 주로 사용
	for (Entry<Integer, String> entry: hm.entrySet())
		System.out.println(entry.getKey() + entry.getValue()); // 1 사과
		}	
	}
