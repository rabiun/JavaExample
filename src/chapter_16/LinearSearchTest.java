package chapter_16;

import java.util.Scanner;

public class LinearSearchTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int searchInt,position;
		
		LinearArray searchArray=new LinearArray(20);
		
		System.out.println(searchArray);
		
		System.out.print("Please enter an integer value (-1 to quit):  ");
		searchInt=input .nextInt();
		
		
		while (searchInt!=-1) 
		{
			
			position=searchArray.linearSearch(searchInt);
			if (position ==-1)
				System.out.println("The integer "+searchInt + "  is not found");
			else
				System.out.println("The integer "+searchInt + "  is found in position: "+position+"\n");
			
			System.out.print("Please enter an integer value (-1 to quit):  ");
			searchInt=input .nextInt();
		}

		input.close();
	}

}
