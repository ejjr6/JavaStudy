package b.defaults;

public interface Printable {
	
	void Print();
	
	default void colorPirint() {
		System.out.println("칼라프린터 출력");
	}
}
