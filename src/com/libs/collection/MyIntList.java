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
			arr[cursor++] = num; //커서의 위치에 입력하는 값 저장
	}

	public int get(int idx) {
		return arr[idx];
	}

	public int size() {
		//처음에는 arr.length를 리턴하려 했지만, 이렇게 되면 배열에 값이 없어도 설정된 배열의 길이를 반환하기 때문에 의미가없음
		return cursor;
	}
	
	public void remove(int idx) {
		
	}
	
	
	@Override
	public String toString() {
		String tmp="";
		for(int i : arr) {
			tmp += i+", ";
		}return "["+tmp+"]";
	}
}
