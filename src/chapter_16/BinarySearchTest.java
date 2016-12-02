package chapter_16;

import java.util.Scanner;

public class BinarySearchTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int searchInt;
		int position;
		
		BinarySearch searchArray=new BinarySearch(15);
		System.out.println(searchArray);
		
		System.out.print("Please enter a integer (-1 to quit):");
		searchInt=input.nextInt();
		System.out.println();
		
		while (searchInt!=-1) {
			position=searchArray.searchInArray(searchInt);
			if(position==-1)
				System.out.println("The integer "+searchInt+" was not found.\n");
			else
				System.out.println("The integer "+searchInt+" was found in position: "+position+"\n");
			
			System.out.print("Please enter a integer (-1 to quit):");
			searchInt=input.nextInt();
			System.out.println();
		}
		input.close();

	}

}
