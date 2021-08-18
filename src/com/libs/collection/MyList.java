package com.libs.collection;
/*
 * 자료 구조 구현을 위한 메소드 규격을 정의한 인터페이스
 * @author jaeskaaa
 * 
 */
public interface MyList<E> {
	//커스텀한 자료구조 구조체의 핵심기능들을 인터페이스화 하여 규격으로 만듦
	//해당 인터페이스를 상속하는 모든 클래스는 하기의 메서드들을 강제적으로 구현 해야만 함.
	
	//하지만, 단일 타입으로 인터페이스를 지정해버리면 하나의 타입형만(여기서는 int) 올수 있다는 한계가 있음
	//이러한 한계를 극복하고자 Generics 사용
	
	///기존의 추상메소드들(int타입)
//	public abstract void add(int num);
//	public abstract void remove(int idx);
//	public abstract void clear();
//	public abstract int get(int idx);
//	public abstract int size();
	
	//타입변수를 전부 T로 변환해줘서 어떤 자료형이든지 들어 올 수 있도록 만들어 줌
	public abstract void add(E element);
	public abstract void remove(int idx); //인덱스 값은 정수만
	public abstract void clear();
	public abstract E get(int idx); //인덱스 값은 정수만
	public abstract int size(); //사이즈는 갯수니까 정수만
	
}
