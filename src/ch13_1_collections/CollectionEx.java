package ch13_1_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

class MyClass{}

public class CollectionEx {

	public static void main(String[] args) {
		
		//값을 저장하는 배열
		int[] arr1 = new int[3];
		arr1[0]= 1;
		System.out.println(arr1[0]);
		
		//번지를 저장하는 배열
		MyClass[] arr2 = new MyClass[3]; //MyClass타입의 배열을 생성하는데, 바로 인스턴스를 담을순 없고 배열 길이를 지정해줘야함
		arr2[0] = new MyClass();
		System.out.println(Arrays.toString(arr2));

		//배열의 한계...
		
		//Collection 자료 구조 등장

		List<String> list1 = new ArrayList<>(); //ArrayList가 List를 상속하거나 인터페이스 구현을 한 것임.
		list1.add("korea");
		list1.add("응가");
		
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1); // 숫자 1이 자동 박싱되어 new Integer(1)로 List에 들어 가는 것임. 
		list2.add(new Integer(3));
		System.out.println(list2.get(1));
		System.out.println(list2);
		
		List<Character> list3 = new Vector<>();
		list3.add('a');
		list3.add('f');
		System.out.println(list3); //Collection interface에 toString이 전부 오버라이딩 되어있어서 따로 toString없이 출력 가능한 것임
		
		List<Float> list4 = new LinkedList<>();
		list4.add(10.1f); list4.add(1.1f);
		
		List<Double> list5 = new LinkedList<>();
		list5.add(5.1); 
		
		Set<Double> set = new HashSet<>(); // 중복을 허용 안함
		set.add(0.1);
		set.add(0.1); //중복저장안하고 대체함
		System.out.println(set);
	
		Map<Integer, String> map = new HashMap<>();
		map.put(211, "강남");
		map.put(210, "종로");
		System.out.println(map);
	
	}

}
