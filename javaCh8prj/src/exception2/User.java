package exception2;

public class User {

	static Account myAccount = new Account();
	int atmMoney = 0;
	
	public void withdraw(int money) {
		myAccount.money -= money;
		System.out.println("내 계좌 : " + myAccount.money);
	}
	
	
	public int getMoney(int money) throws Exception{
		atmMoney -= money;
		if(atmMoney < 0) {
			throw new Exception();	//예외 발생
		}
		System.out.println("ATM : " + atmMoney);
		return money;
	}
	
	public static void main(String[] args) {
		
		/*
		 * 1. 카드를 ATM에 넣기
		 * 2. 인출 버튼 누르기
		 * 3. 금액 입력
		 * 4. 비밀번호 입력
		 * 	yes
		 * 		- 5번으로 넘어감
		 * 	no
		 * 		- "비밀번호가 잘 못 입력되었습니다." 출력
		 * 5. 계좌에 돈 있는지 확인
		 *  yes	
		 *  	- 계좌에서 인출 금액 차감	//예외발생
		 * 		- 돈을 현금인출기에서 받기
		 *  no	
		 *  	- "돈이 없습니다" 출력
		 * 6. 카드 돌려받기
		 * 
		 */
		User u = new User();
		int mymoney = 0;
		int money=1000;
		
		try {
			System.out.println("카드 넣기");
			System.out.println("인출버튼 클릭");
			System.out.println("금액 입력");
			System.out.println("비밀번호 입력");
			System.out.println("계좌에서 인출금액 차감");
			u.withdraw(money);	//계좌에서 돈을 차감
			
			System.out.println("돈을 현금인출기에서 받기");
			mymoney = u.getMoney(money);	//ATM기에 돈이 없어서 예외 발생
			
			System.out.println("내 돈 : "+mymoney);
			
		} catch (Exception e) {
			System.out.println("예외 발생");
			myAccount.money += money;
			System.out.println("내 계좌 : " + myAccount.money);
		} finally {
			System.out.println("카드 돌려받기");
		}
		
	}
	

}
