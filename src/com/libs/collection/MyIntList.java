package com.libs.collection;

public class MyIntList {
	//필드
	private int[] arr;
	private int cursor;
	
	
	
	//생성자
	public MyIntList(int amount) {
		this.arr = new int[amount];
		cursor = 0;
	}
	
	//메소드
	public void add(int num) {
		try {
		arr[cursor++] = num; //커서의 위치에 입력하는 값 저장
		}catch(ArrayIndexOutOfBoundsException e) { //예외 발생되면 하기와 같이 배열 새로 생성
			int[] arr2 = new int[arr.length+1];
			for(int i=0, k=0; i<=arr.length; i++) {
				if(i==arr.length) {//배열의 길이가 i값과 같아진다 (배열이 꽉찼다)
					arr2[k] = num; //arr2배열[k]에 num을 넣어주고 반복문 탈출
					break;
				}
				arr2[k++] = arr[i]; // arr배열의 값을 arr2에 추가
			}
			arr=arr2; //arr2의 주소를 arr에 저장
			
		}
	}

	public int get(int idx) {
		return arr[idx];
	}

	public int size() {
		//처음에는 arr.length를 리턴하려 했지만, 이렇게 되면 배열에 값이 없어도 설정된 배열의 길이를 반환하기 때문에 의미가없음
		return cursor;
	}
	
	public void remove(int idx) {
		//먼저 배열값을 복사해서 새로운 배열 생성
		int [] arr2 = new int[arr.length-1];
		for(int i=0, k=0; i<arr.length; i++) {
			if( i== idx) { //i값이 인덱스 번호와 같은 배열에는 배열 추가하지 않고 다시 조건문으로 올라감
				continue;
			}
			arr2[k++] = arr[i];
		}
		arr=arr2;
		cursor--; //배열을 삭제해줬으니 커서도 하나 줄여줘야함
	}
	
	public void removeAll() {
		for(int i=0; i<arr.length; i++) {
			arr[i]=0;
		}
	}
	
	
	@Override
	public String toString() {
		String tmp="";
		for(int i : arr) {
			tmp += i+", ";
		}return "["+tmp+"]";
	}
}
