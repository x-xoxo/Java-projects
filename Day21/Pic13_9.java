package Day21;

public class Pic13_9 {

	public static void main(String[] args) {
		new TimerThread().start();
	}

}
class TimerThread extends Thread {
	int n = 0;
	public void run()
	{
		while(true)
		{
			System.out.println(n);
			n++;
			try {
				sleep(1000);
			} catch(InterruptedException e) {return;}
		}
	}
}