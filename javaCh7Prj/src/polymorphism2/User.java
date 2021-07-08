package polymorphism2;

public class User {

	void read(Board board) {
		board.select();
	}
	
	public static void main(String[] args) {
		User user = new User();
		
		ImgBoard imgBoard = new ImgBoard();
		
		user.read(imgBoard);
	}

}
