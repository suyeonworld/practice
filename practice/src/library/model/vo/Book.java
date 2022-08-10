package library.model.vo;

public class Book {
	
	String title;
	int category;
	String author;
	
	public Book() {
		
	}

	public Book(String title, int category, String author) {
		super();
		this.title = title;
		this.category = category;
		this.author = author;
	}
	
	public String toString() {
//		필드 값 문자열 합친 후 리턴
//		category 분류 별로 출력
//		1 : 인문 / 2 : 자연과학
//		3 : 의료 / 4 : 기타

		return author;
		
	}
	
	
}
