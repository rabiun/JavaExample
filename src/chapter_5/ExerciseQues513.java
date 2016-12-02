package chapter_5;

public class ExerciseQues513 
{

	
	public static void main(String[] args) 
	{
		long factorialValue;
		System .out.println("Number           Factorial");
		for (long i = 1; i <=20; i++) {
			
			factorialValue =factorial(i);
			System .out.printf("%d  %20d\n",i,factorialValue );
		}
		
		//NORMAL FOR LOOP
		System .out.println("Number           Factorial");
		for (long i = 1; i <=20; i++) {
			
			factorialValue =factorialForLoop(i);
			System .out.printf("%d  %20d\n",i,factorialValue );
		}

	}

	private static long factorialForLoop(long i) {
		// TODO Auto-generated method stub
		long result=1;
		for (long j = i; j>=1; j--) {
			result*=j;
		}
		return result;
	}

	private static long factorial(long number) {
		if(number==1)
			return 1;
		else
		    return number*factorial(number -1);
	}

}
