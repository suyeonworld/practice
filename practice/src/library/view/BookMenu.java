package library.view;

import java.util.Scanner;

import library.controller.BookManager;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookManager bookManager = new BookManager();
	
	
	public BookMenu() {
		// TODO Auto-generated constructor stub
	}
	
	public void mainMenu() {
//		도서 관리 프로그램에 해당하는 메인 메뉴
//		출력, 각 메뉴에 해당하는 메소드 실행
//		 반복 출력되게 함
	}
	public void insertBook() {
//		제목, 카테고리, 저자명을 키보드로 입력 받
//		고 입력 받은 값을 가지고 Book객체 생성
//		생성한 Book 객체를 BookManager의
//		insertBook 메소드로 전달
	}
	public void deleteBook() {
//		삭제할 도서 번호를 키보드로 입력 받아
//		BookManager의 deleteBook 메소드로 전달
//		 리턴 받은 결과 값을 가지고
//		성공, 실패 여부 출력
	}
	public void searchBook() {
//		검색할 도서명을 키보드로 입력 받아
//		BookManager의 searchBook 메소드로 전달
//		리턴 받은 리스트가 비어있는 경우
//		“검색 결과 없음” 출력
//		리턴 받은 리스트가 비어있지 않을 경우
//		검색 결과 목록 출력
	}
	public void selectList() {
//		BookManager의 selectList 메소드 호출하여
//		리턴 받은 리스트가 비어있는 경우
//		“도서가 없습니다.” 출력
//		비어있지 않는 경우
//		전체 리스트 목록 출력

	}
}
