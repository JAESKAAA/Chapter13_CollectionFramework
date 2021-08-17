package ch13_1_collections;

import java.util.Arrays;

import com.libs.collection.MyIntList;

public class MyCollectionTest2 {

	public static void main(String[] args) {
		/********커스텀 라이브러리 만들기*********
		 * 1.add 기능 구현(완료)
		 * 2.get 기능 구현 (완료)
		 * 3.size 기능 구현 (완료)
		 * 4.ArrayIndexOutOfBoundsException 해결_자동으로 배열길이 늘려주는 기능 (완료)
		 * 5.remove 기능 구현 (완료)
		 * 6.배열 초기화_일괄삭제기능 (완료)
		 * 
		 */
		
		MyIntList list = new MyIntList(3);
		list.add(1);
		list.add(3);
		list.add(5);
		//ArrayIndexOutOfBoundsException
		list.add(7);
		
		
		// 삭제 예시
		//[1,3,5,] -> [1,5,] 즉, 사이즈도 줄어야하고 배열인덱스의 값도 없어져야 함
		list.remove(1);
	
		//일괄 삭제 -> [0,0,0] 으로 나와야함
		//list.clear(); 하면 배열이 초기상태로 만들어 주는 기능
		System.out.println(list);
		System.out.println("list[1]의 값: "+list.get(1));
		System.out.println("size :"+ list.size());
		list.removeAll();
		System.out.println(list);
		System.out.println("==================================");
	}

}
