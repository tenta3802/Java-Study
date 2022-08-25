package structires_algorithm;

import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       List<String> list = new ArrayList<>();
       List<String> list2 = new ArrayList<>();
       
       list2.add("대구");
       
       list.add("서울");
       list.add("수원");
       list.add("안산");
       list.add(1, "부산");
       list.addAll(list2);

       System.out.println(list.get(0));
       list.set(0, "경주");
       
       System.out.println(list.indexOf("경주"));
       System.out.println(list.lastIndexOf("대구"));
       
       list.remove(0);
       list.remove("서울");
       list.removeAll(list2);
       list.retainAll(list2);
       
       list.clear();
       System.out.println(list.isEmpty());
       System.out.println(list.size());
       
       System.out.println(list.contains("서울"));
       System.out.println(list.containsAll(list2));
       
    }
}
