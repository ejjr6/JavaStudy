package t05_control_method.notify_wait_1;

public class ProduceThread extends Thread {
	private DataBox dataBox;

	public ProduceThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for(int i=0; i<=3; i++) {
			String data = "Data-"+i;
			dataBox.setData(data);
		}
	}
}