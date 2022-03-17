package d.phone;

public class AndroidPhone extends DMBPhone {
	
	String url;

	public AndroidPhone(String model, String color, int channel, String url) {
		super(model, color, channel);
		this.url = url;
	}

	@Override
	void sendVocie(String message) {
		super.sendVocie(message);
	}

	@Override
	void receiveVoice(String message) {
		super.receiveVoice(message);
	}
}
