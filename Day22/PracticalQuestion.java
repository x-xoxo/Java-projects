package Day22;

import java.util.Scanner;

public class PracticalQuestion {

	public static void main(String[] args) {
		Thread th = new Thread(new OneToTen());
		th.start();
	}

}
class OneToTen implements Runnable {
	private int sum = 0;
	synchronized public void countToTen()
	{
		while(sum<10)
		{
			sum++;
			System.out.print(getSum()+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
		System.out.println();
		System.out.println("스레드 종료.");
	}
	public int getSum() { return sum; }
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아무 키나 입력>> ");
		String init = sc.nextLine();
		if(!init.equals(""))
			countToTen();
		else
			run();
		sc.close();
	}
	
}