package chap11.sec6;

public class AccountExam1 {

	public static void main(String[] args) {
		Account account = new Account();
		//예금
		account.deposit(10000);
		System.out.println("잔고 : " + account.getBlance());
		
		try {
			account.withdraw(30000);
		}catch(Insuf e) {
			String message = e.getMessage();
			System.out.println(message);
		}

	}

}
