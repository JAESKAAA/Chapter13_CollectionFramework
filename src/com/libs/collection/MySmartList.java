package com.libs.collection;

public class MySmartList<E> implements MyList<E> {

	//[필드]
	private Object[] elementD; // 타입을 Object로 지정해줌으로써 모든 객체 타입을 담을 수 있게해준다.
	
	private int capacity;
	
	private final int amount;
	
	private int cursor;
	
	//[생성자]
	public MySmartList(int amount){
		this.amount=amount;
		this.capacity = amount;
		elementD = new Object[capacity];
		cursor = 0;
	}
	
	public MySmartList() {
		this(3); //기본 생성자만 써도 위에 생성자에 매개변수 3을 넣은 것과 똑같이 적용하게해줌
	}
	
	//[메소드]
	@Override
	public void add(E e) {
		//현재 용량을 초과하는지의 여부 조건 검사
		if(capacity <= cursor) {
		//배열 복사 수행
		///새로운 배열 생성
		Object[] tempArr = new Object[capacity + amount];
		///요소 복사
		System.arraycopy(elementD, 0, tempArr, 0, elementD.length);
		///참조 변경
		elementD = tempArr;
		/// 배열 용량 용량 업데이트
		capacity += amount;
		}
		elementD[cursor++] = e;
						
	}

	@Override
	public void remove(int idx) {
		//삭제하고자 하는 인덱스가 배열의 마지막 요소가 아닌 조건
		if(idx != cursor-1) {
		//배열의 처리
		System.arraycopy(elementD, idx+1, elementD, idx, (cursor-1)-idx);
		}
		//마지막 데이터 초기화
		elementD[cursor-1]= 0;
		//현재위치 재설정
		cursor--;		
	}

	@Override
	public void clear() {
		//커서, 배열용량, 배열 모두 초기값으로 변경 해주면 간단히 끝남
		elementD=new Object[amount];	
		capacity = this.amount;
		cursor = 0;		
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get(int idx) {
		return (E) elementD[idx]; //원래는 Object 타입으로 배열이 저장되기 때문에 E 타입변수형으로 캐스팅 해야함
	}

	@Override
	public int size() {
		return cursor;
	}

	@Override
	public String toString() {
		String tmp="";
		for(Object e : elementD) {
			tmp += (E)e+", "; //오브젝트로 담은 변수 e를 타입변수형으로 형변화 해줘야 사용 가능
		}return "["+tmp+"]";
	}
	
	
	
}
