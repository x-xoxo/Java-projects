package Day22;

public class SynchronizedEx {

	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();

		Thread th1 = new StudentThread("kitae", board);
		Thread th2 = new StudentThread("hyosoo", board);

		th1.start();
		th2.start();
	}

}

// 공유 데이터인 집계판을 시뮬레이션 하는 클래스
// 두 StudentThread 스레드에 의해 동시 접근됨
class SharedBoard {
	private int sum = 0; // 집계판의 합

	synchronized public void add() {
		int n = sum;
		Thread.yield();
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}

	public int getSum() {
		return sum;
	}
}

class StudentThread extends Thread {
	private SharedBoard board;

	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			board.add();
	}
}