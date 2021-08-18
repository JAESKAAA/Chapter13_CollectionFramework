package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && (member.age==age);
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		//String에서 재정의된 해쉬코드가 name.hashCode()로 반환되고,
		//거기에 int 타입 age를 더해줌으로써 구별가능한 해쉬코드를 리턴 해줌
		return name.hashCode()+age;
	}
}


public class HashSetExample {

	public static void main(String[] args) {

		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동",30)); //인스턴스는 다르지만 내부 데이터가 동일하므로 객체1개만 저장
		set.add(new Member("홍길동",30));
		
		System.out.println("총 객체수 : "+ set.size());
		System.out.println(set);
		
		Iterator<Member> it = set.iterator();
		while(it.hasNext()) {
			Member m = it.next();
			System.out.println(m.name+", "+m.age);
		}
		
	}

}
