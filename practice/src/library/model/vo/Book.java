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
//		�ʵ� �� ���ڿ� ��ģ �� ����
//		category �з� ���� ���
//		1 : �ι� / 2 : �ڿ�����
//		3 : �Ƿ� / 4 : ��Ÿ

		return author;
		
	}
	
	
}
