package chapter_5;

import java.util.Scanner;

public class Ques511 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int smallest;
		int counter;
		
		System .out .print("How many Number u want to input:");
		
		Scanner input=new Scanner(System .in);
		counter=input .nextInt();
		
		int[] number=new int[counter];
		
		System .out .printf("please input %d numbers. \n",counter);
		for (int i = 0; i <counter; i++) {
			number[i]=input.nextInt();
		}
		
		smallest=number[0];
		for (int i = 1; i < counter ; i++) {
			if(smallest>number[i])
			{
				smallest=number[i];
			}
		}
		System .out.println("smallest num is:"+smallest);
		input.close();

	}

}
