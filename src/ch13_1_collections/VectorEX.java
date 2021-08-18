package ch13_1_collections;

import java.util.List;
import java.util.Vector;

/**[Vector] 
 * 
 * -ArrayList와 동일한 내부구조
 * -동기화된 메소드로 구성되어있음
 * -멀티스레드가 동시에 Vector메소드 접근 불가, 
 */

class Board{

	private String subject;
	private String content;
	private String writer;
	
	public Board(String subject, String content, String writer) {
		this.subject=subject;
		this.content=content;
		this.writer =writer;
	}
	public String getSubject() {
		return subject;
	}
	
	public String getContent() {
		return content;
	}
	
	public String getWriter() {
		return writer;
	}
	
}

public class VectorEX {

	public static void main(String[] args) {

		List<Board> list = new Vector<>();
		
		list.add(new Board("제목1","내용1","글쓴이1"));
		list.add(new Board("제목2","내용2","글쓴이2"));
		list.add(new Board("제목3","내용3","글쓴이3"));
		list.add(new Board("제목4","내용4","글쓴이4"));
		list.add(new Board("제목5","내용5","글쓴이5"));
		
		list.remove(2);
		list.remove(2);
		
		//배열에 객체가 들어가 있을때 원하는 값을 출력 하는 방법
		//필드값은 보통 private 이기 때문에 get/set으로 제어하는것 잊지 말기
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.printf("%s\t%s\t%s%n",board.getSubject(),board.getContent(),board.getWriter());
		}
	}

}
