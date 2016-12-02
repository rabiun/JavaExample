package practice_program;

public class TwoNumSwap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=6,b=4;
		System.out.printf("Before Swaping:a=%d and b=%d \n",a,b); 
		//first way
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("After Swaping:a=%d and b=%d \n",a,b);
		//second way
		b=a+b-(a=b);
		System.out.printf("Again Swaping:a=%d and b=%d \n",a,b);
		
	}

}
