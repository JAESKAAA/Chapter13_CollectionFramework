package ch13_1_collections;

import java.util.Arrays;

public class MyCollectionTest1 {

	public static void main(String[] args) {

		int [] list = new int[3];
		
		list[0] = 1;
		list[1] = 3;
		list[2] = 5;
		
		System.out.println(list[2]);
		System.out.println(list.length);
		System.out.println(Arrays.toString(list));
		
		//list[3] = 7; 추가하면 ArrayIndexOutOfBoundsException 발생될 것
		//배열복사와 삭제의 번거로움이 있음
		
		
	}

}
