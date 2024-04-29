package chap14.sec05.exam3;

public class YieldExam1 {

	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		try {Thread.sleep(5000);}
		catch(InterruptedException e) {}
		
		workThreadA.work = false;
		
		try {Thread.sleep(10000);}
		catch(InterruptedException e) {}
		
		workThreadA.work = true;
		
	}

}
