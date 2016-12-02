package pluralsight.javaFundamentals1;



public class HelloWorld {

	public static void main(String[] args)
	{
		IMachine machine = new Printer(true, "MY PRINTER");
		//Machine machine = new Machine(false);
		
		machine.TurnOn();
				
	}
}
