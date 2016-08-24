package test;

public class TestSynchronized2 {

	public static void main(String[] args) {
		TestThread tt = new TestThread(0);
		TestThread tt2 = new TestThread(1);
		new Thread(tt).start();
		new Thread(tt2).start();
	}
}

class TestThread implements Runnable {
	int num = 100;
	private byte[] lock = new byte[0];
	private int type;

	public TestThread(int t) {
		type = t;
	}

	public void run() {
		synchronized (lock) {

			try {
				if (type == 0) {
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				e.getMessage();
			}

			System.out.println(Thread.currentThread().getName());
		}
	}
}
