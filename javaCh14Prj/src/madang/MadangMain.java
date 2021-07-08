package madang;

public class MadangMain {

	public static void main(String[] args) {
		BookFunction bf = new BookFunction();
		
		Book book1 = new Book();
		book1.setBookId(1);
		book1.setBookName("축구의 역사");
		book1.setPublisher("굿스포츠");
		book1.setPrice(7000);
		bf.insertBook(book1);

		Book book2 = new Book();
		book2.setBookId(2);
		book2.setBookName("축구아는 여자");
		book2.setPublisher("나무수");
		book2.setPrice(13000);
		bf.insertBook(book2);
		
		Book book3 = new Book(3,"축구의 이해", "대한출판사", 22000);
		bf.insertBook(book3);
		
		bf.selectBook();
		bf.updateBook(3, "농구의 이해");
		bf.selectBook();
		bf.updateBook(4, "오라클");
		bf.selectBook();
		bf.deleteBook(3);
		bf.selectBook();
		
	}

}
