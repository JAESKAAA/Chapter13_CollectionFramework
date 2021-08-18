package com.libs.collection;

public class MyIntList2_Academy {
	//필드
	private int[] arr;
	
	/// 현재 배열의 총 길이
	private int capacity;
	
	///늘려 줄 배열의 용량
	///배열을 1씩 증가시키게 되면 add할때마다 배열복사가 일어나 성능저하를 유발 할 수 있음
	///따라서, 버퍼를 어느정도 여유있게 지정해줘서 배열 복사를 최소화하도록 만들어 줘야 함
	private final int amount;
	
	
	///배열 요소의 현재 위치
	private int cursor;
	
	
	
	//생성자
	public MyIntList2_Academy(int amount) {
		this.amount=amount;
		this.capacity = this.amount;
		this.arr = new int[capacity];
		cursor = 0;
	}
	
	//메소드
	public void add(int num) {
		//현재 용량을 초과하는지의 여부 조건 검사
		if(capacity <= cursor) {
			//배열 복사 수행
			///새로운 배열 생성
			int[] tempArr = new int[capacity + amount];
			///요소 복사
			System.arraycopy(arr, 0, tempArr, 0, arr.length);
			///참조 변경
			arr = tempArr;
			/// 배열 용량 용량 업데이트
			capacity += amount;
		}
		arr[cursor++] = num;
		
	}

	public int get(int idx) {
		return arr[idx];
	}

	//배열의 길이가 아닌, 배열에 담겨있는 요소의 갯수를 반환함
	public int size() {
		//처음에는 arr.length를 리턴하려 했지만, 이렇게 되면 배열에 값이 없어도 설정된 배열의 길이를 반환하기 때문에 의미가없음
		return cursor;
	}
	
	public void remove(int idx) {
		//삭제하고자 하는 인덱스가 배열의 마지막 요소가 아닌 조건
		if(idx != cursor-1) {
			//배열의 처리
			System.arraycopy(arr, idx+1, arr, idx, (cursor-1)-idx);
		}
		//마지막 데이터 초기화
		arr[cursor-1]= 0;
		//현재위치 재설정
		cursor--;
	}	
	
	//배열 초기화
	public void clear() {
		//커서, 배열용량, 배열 모두 초기값으로 변경 해주면 간단히 끝남
		arr=new int[amount];	
		capacity = this.amount;
		cursor = 0;
	}
	
	
	@Override
	public String toString() {
		String tmp="";
		for(int i : arr) {
			tmp += i+", ";
		}return "["+tmp+"]";
	}
}
