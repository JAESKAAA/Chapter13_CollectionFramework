package ch13_1_collections;

import java.util.*;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		/*
		 * ArrayList
		 * -검색(인덱스로 바로 접근)과 배열 맨 끝 저장 시 유리
		 * -저장 객체가 많고 추가/삭제가 빈번한 경우 불리함
		 */
		
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("Servlet/JSP");
		list.add(2, "DataBase");
		list.add("iBatis");
		
		System.out.println("list 총 객체수"+list.size());
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2: "+skill);
		System.out.println();
		
		for(int i =0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ ":" + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove(2);
		list.remove("iBatis");
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+":"+str);
		}
	}

}
