package opp6;

public class MainClass {

	public static void main(String[] args) {
		
		Book book1 = new Book(1, "혼공자", "한빛미디어", 20000);
		Book book2 = new Book(2, "오라클", "이지퍼블리싱", 18000);
		Book book3 = new Book(3, "HTML", "가갸거겨문고", 20000);
		Book book4 = new Book(4, "스프링", "한빛미디어", 20000);
		
		book1.select();
		book2.select();
		book3.select();
		

	}

}
