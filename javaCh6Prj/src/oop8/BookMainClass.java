package oop8;

public class BookMainClass {
	
	public static void main(String[] args) {
		
		Book book = new Book();	//객체화 진행
		
		book.setBookId(1);
		book.setBookName("축구의 역사");
		book.setPublisher("굿스포츠");
		book.setPrice(7000);
		
//		System.out.println(book.getBookId());
//		System.out.println(book.getBookName());
//		System.out.println(book.getPublisher());
//		System.out.println(book.getPrice());
		
		Book[] bookArr = new Book[10];
//		[book1][book2][book3][book4]...
//		bid		bid
//		bname	bname
//		publi	publi
//		price	price
		
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		
		book1.setBookId(2);
		book1.setBookName("축구아는 여자");
		book1.setPublisher("나무수");
		book1.setPrice(13000);

		book2.setBookId(3);
		book2.setBookName("축구의 이해");
		book2.setPublisher("대한출판사");
		book2.setPrice(22000);
		
		book3.setBookId(4);
		book3.setBookName("골프 바이블");
		book3.setPublisher("대한출판사");
		book3.setPrice(35000);
		
		bookArr[0] = book;
		bookArr[1] = book1;
		bookArr[2] = book2;
		bookArr[3] = book3;
		
		System.out.println("BOOKID\t|\tBOOKNAME\t|\tPUBLISHER\t|\tPRICE");
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println(bookArr[i].getBookId()+"\t|\t"+bookArr[i].getBookName()+"\t|\t"+bookArr[i].getPublisher()+"\t\t|\t"+bookArr[i].getPrice());
			
			
		}
		
	}
}
