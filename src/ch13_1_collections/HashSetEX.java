package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEX {

	public static void main(String[] args) {
		/*[HashSet]
		 * 
		 * List 컬렉션(인터페이스)는 객체의 순서를 유지하지만,
		 *  - Set 컬렉션(인터페이스)는 저장 순서가 유지되지 않는다.
		 *  - 인덱스로 관리되지 않음
		 *   : 반복자(Iterator)를 제공함
		 *  - 중복해서 저장할 수 없는 수학의 집합 개념
		 * 
		 */
		Set<String> set = new HashSet<>();
		
		// hashCode()+equals() 를 통한 객체 주소비교
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); //Java 중복으로 한번만 저장됨
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: "+size);
		//반복자를 이용한 루핑
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String elements = it.next();
			System.out.println("\t"+elements);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: "+set.size());
		
		//반복자 다시 얻기(초기화함)
		it = set.iterator();
		
		for(String elements : set) {
			System.out.println("\t"+elements);
		}
		
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어있음");
		}
		
	}

}
