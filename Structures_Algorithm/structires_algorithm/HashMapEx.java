package structires_algorithm;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapEx {
	
		
	HashMap<Integer, String> hm = new HashMap<>();
	HashMap<String, String> hm2 = new HashMap<>();

	public <K, V> void put(K key, V value) {
		
	hm.put(1, "���");
	hm.put(2, "�ٳ���");
	hm.put(3, "����"); 
	// key 1�� �̹� �����ϸ� key 1�� value�� "����"�� ��ü

	hm.remove(1); // key �����θ� ��� ���� ����
	hm.clear(); // ��ü ����

	hm.containsKey(1); // key �� �� 1�� ������ true, ������ false
	hm.containsValue("���"); // value �� "���"�� ������ true, ������ false
	}
	// �� ���
	// ��� 1
	public <K> void keySet(){
	for (Integer i: hm.keySet()) {
		System.out.println(i + hm.get(i)); // 1 ���
	}
	// ��� 2: key�� value�� ��� �ʿ��� �� �ַ� ���
	for (Entry<Integer, String> entry: hm.entrySet())
		System.out.println(entry.getKey() + entry.getValue()); // 1 ���
		}	
	}
