package structires_algorithm;

import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       List<String> list = new ArrayList<>();
       List<String> list2 = new ArrayList<>();
       
       list2.add("�뱸");
       
       list.add("����");
       list.add("����");
       list.add("�Ȼ�");
       list.add(1, "�λ�");
       list.addAll(list2);

       System.out.println(list.get(0));
       list.set(0, "����");
       
       System.out.println(list.indexOf("����"));
       System.out.println(list.lastIndexOf("�뱸"));
       
       list.remove(0);
       list.remove("����");
       list.removeAll(list2);
       list.retainAll(list2);
       
       list.clear();
       System.out.println(list.isEmpty());
       System.out.println(list.size());
       
       System.out.println(list.contains("����"));
       System.out.println(list.containsAll(list2));
       
    }
}
