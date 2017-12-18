package sample.s01;

public class ClassSample {

	public static void main(String[] args) {
		Counter counter1 = new Counter();
		Counter counter2 = new Counter();
		counter1.show();
		counter1.count();
		counter1.show();
		
		counter2.count();
		counter2.count();
		counter2.count();
		counter2.show();
	}

}
