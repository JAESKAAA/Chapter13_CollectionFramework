package ch13_1_collections;

import com.libs.collection.MyIntList;
import com.libs.collection.MyList;
import com.libs.collection.MySmartList;

/********커스텀 라이브러리 만들기*********
 * 1.add 기능 구현(완료)
 * 2.get 기능 구현 (완료)
 * 3.size 기능 구현 (완료)
 * 4.ArrayIndexOutOfBoundsException 해결_자동으로 배열길이 늘려주는 기능 (완료)
 * 5.remove 기능 구현 (완료)
 * 6.배열 초기화_일괄삭제기능 (완료)
 * 7.인터페이스화 (완료)
 * 8.제네릭스를 통한 형변환 처리 (완료)
 */

class MyClass1{}

public class MyCollectionTest3 {

	public static void main(String[] args) {
		
		
		MyList<String> list = new MySmartList<>();
		
		list.add("1");
		list.add("3");
		list.add("★");
		//ArrayIndexOutOfBoundsException
		System.out.println(list);
		System.out.println("list[1]의 값: "+list.get(1));
		System.out.println("size :"+ list.size());
		System.out.println("==================================");
		
		list.add("kor");
		list.add("홍길동");
		list.add("a");
		System.out.println(list);
		System.out.println("list[1]의 값: "+list.get(1));
		System.out.println("size :"+ list.size());
		System.out.println("==================================");
		
		// 삭제 예시
		//[1,3,5,] -> [1,5,] 즉, 사이즈도 줄어야하고 배열인덱스의 값도 없어져야 함
		list.remove(1);
		System.out.println(list);
		System.out.println("list[1]의 값: "+list.get(1));
		System.out.println("size :"+ list.size());
		System.out.println("==================================");
		
		//일괄 삭제 -> [0,0,0] 으로 나와야함
		//list.clear(); 하면 배열이 초기상태로 만들어 주는 기능
		list.clear();
		System.out.println(list);
		System.out.println("list[1]의 값: "+list.get(1));
		System.out.println("size :"+ list.size());
		System.out.println("==================================");

		MyList<Integer> list2 = new MySmartList<>();
		list2.add(new Integer(100));
		list2.add(200);
		System.out.println(list2);
		System.out.println("list2[1]의 값: "+list2.get(1));
		System.out.println("size :"+ list2.size());
		System.out.println("==================================");
		
		MyList<Object> list3 = new MySmartList<>();
		list3.add("Hello");
		list3.add(11);
		list3.add(3.14f);
		list3.add('A'); //오토박싱 (new Character('A'));
		//Object로 타입 지정시 문제점이 하기와 같은 사용자 지정 타입의 형변환이 힘들어 주소로 출력 되게 됨
		//또한 박싱, 언박싱, 형변환시 많은 메모리를 소모하기 떄문에 권장 되지 않음
		list3.add(new MyClass1()); 
		System.out.println(list3);
		System.out.println("list2[1]의 값: "+list3.get(4));
		System.out.println("size :"+ list3.size());
		System.out.println("==================================");
		
		

	}

}
