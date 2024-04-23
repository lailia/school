package chap11.sec6;

public class Account {
	private long blance;
	public Account() {	}
	
	public long getBlance() {
		return this.blance;
	}
	
	public void deposit(int money) {
		blance += money;
	}
	
	public void withdraw(int money) throws Insuf{
		if(blance < money) {
			throw new Insuf("잔고 부족 : " + (money - blance) + "이 모자람");
		}
		
		blance -= money;
	}

}
