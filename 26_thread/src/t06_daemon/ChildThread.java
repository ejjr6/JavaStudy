package t06_daemon;

public class ChildThread extends Thread {

	@Override
	public void run() {
		while(true) {
			System.out.println("child Daemon");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}
