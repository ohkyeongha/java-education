package opp6;

public class Book {
	/* bookid		number
	 * bookname		varchar2
	 * publisher	varchar2
	 * price		number
	 */
	
	int bookid;
	String bookname;
	String publisher;
	int price;
	
	Book(){}
	
	Book(int bookid, String bookname, String publisher, int price){	//초기화를 위한 생성자
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
	}
	
	
	void select() {
		System.out.println(bookid + "\t" + bookname + "\t" + publisher + "\t" + price);
	}
	void insert(int bookid, String bookname, String publisher, int price) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.publisher = publisher;
		this.price = price;
		
	}
	void update(int bookid, String bookname) {	
//		update	book
//		set		bookname = "수정값"
//		where		bookid = 수정될bookid;
		
		if(this.bookid == bookid) {
			this.bookname = bookname;
		}
		
	}
	void delete(int bookid ) {
//		delete booiname
//		where bookid = 수정될bookid;
		
		if(this.bookid == bookid) {
			this.bookname = null;
			this.publisher = null;
			this.price = 0;
			
		}
	}
}
