package test01.t1;

import java.util.Timer;
import java.util.TimerTask;

//import java.util.Scanner;

public class t1 {

	public static void main(String[] args){
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("time : " + System.currentTimeMillis());
				
			}
		};
		
		timer.schedule(task, 0, 1000);
		
	}

}
