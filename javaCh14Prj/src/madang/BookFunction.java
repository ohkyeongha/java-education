package madang;
import java.util.ArrayList;

public class BookFunction {

	//Book클래스 타입의 ArrayList 생성
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	public void insertBook(Book book){
		bookList.add(book);
	}
	
	public void selectBook() {
		System.out.println("BOOKID\tBOOKNAME\tPUBLISHER\tPRICE");
		for(int i=0 ; i < bookList.size() ; i++) {
			System.out.println(bookList.get(i).getBookId()+"\t"
									+bookList.get(i).getBookName()+"\t"
									+bookList.get(i).getPublisher()+"\t\t"
									+bookList.get(i).getPrice());
			
		}
		System.out.println("------------------------------------------------");
//		System.out.println(bookList.toString());
	
	}
	
	void updateBook(int bookId, String bookName) {	
		for(int i=0 ; i < bookList.size() ; i++) {
			Book book = bookList.get(i);	//book객체를 하나씩 꺼내온다
			
			if(book.getBookId() == bookId) {
				book.setBookName(bookName);
				bookList.set(i, book);
				break;
			}
		}
		
	}
	void deleteBook(int bookId) {
		for(int i=0 ; i < bookList.size() ; i++) {
			Book book = bookList.get(i);
			if(book.getBookId() == bookId) {
				bookList.remove(i);
				break;
			}
		}
	}
	

	

}
