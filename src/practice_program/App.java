package practice_program;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarParts carParts = new CarParts(777);

	
		CarParts.Wheel wheel = carParts.new Wheel();
		
		//test method overriding
		A a =new B();
		a.display(0);
	}

}
