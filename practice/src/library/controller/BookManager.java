package library.controller;

import java.util.ArrayList;
import java.util.List;

import library.model.vo.Book;

public class BookManager {
	
	Book book = new Book();
	
	public BookManager() {
	}
	
	public void insertBook(Book book) {
//		전달받은 Book객체의 도서 번호
//		를 setter메소드를 통해 설정 한 후에 bookList에 추가
	}
	
	public int deleteBook(int bNo) {
//		bookList 의 도서들 중 전달 받은 bNo값이 일치하는 도서가 있을 경우 도서 삭제
//		 성공하면 1 리턴
//		 실패하면 0 리턴

		
		return bNo;
	}
	
	public ArrayList<Book> searchBook(String title){
//		bookList의 도서들 중 전달 받은title값을 포함(contains)한 도서들
//		searchList에 추가 searchList 리턴

		
		return null;
	}
	
	public ArrayList<Book> selectList(){
// bookList 리턴		
		
		return null;
		
	}
}
