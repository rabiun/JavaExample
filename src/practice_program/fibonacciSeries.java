package practice_program;

import java.util.Scanner;

public class fibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("please enter n'th fibonacci sries: \n");
		int n=in.nextInt();
		int a=0,b=1;
		System.out.printf("Fobonacci series are: %d, %d", a,b);
		
		for (int i = 1; i <= n-2; i++) {
			System.out.printf(", %d" , a+b);
			int temp=b;
			b=a+b;
			a=temp;
			
			
		}
		in.close();

	}

}
