package structires_algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
        String[] temp = {"a","b","c"};
        List<String> list = new ArrayList<>(Arrays.asList(temp));
        // Arrays.asList(temp); �� ���ָ� Primitive Stream ������ Wrapper Class��
        // �ٲپ� ���� �ʱ� ������ �� �߰��� ���� �� �� �� ����.
        // �׷��� ArrayList�� ���� ��ȯ�� ����� �Ѵ�.
        
        List<String> list2 = new  ArrayList<>();
        String[] temp2 = list2.toArray(new String[list2.size()]);
        
        int[] arr = {1123, 12313, 3122, 34, 43};
        List<Integer> inlist = Arrays.stream(arr).boxed().collect(Collectors.toList());
        //boxed() �޼ҵ�� ���� ArrayList �� ���������� primitive�� wrapper �� �ٲ���
        // collect(Collectors.toList())�� stream�� List�� ����
        
        List<Integer> integer2 = new ArrayList<>();
        int[] arr2 = integer2.stream().mapToInt(i->i).toArray();
        
        
    }
}
