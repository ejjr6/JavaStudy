package b.defaults;

public class SamsungPrinter implements Printable {

	public void samsungPrint() {
		System.out.println("삼성 프린터기를 출력합니다.");
	}
	
	@Override
	public void Print() {
		System.out.println("삼성 프린터 출력");
	}

}
