package chapter_16;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

	private int[] data;
	private static Random numGenarator = new Random();

	public BinarySearch(int size) {

		data = new int[size];
		for (int i = 0; i < size; i++) {
			data[i] = 10 + numGenarator.nextInt(90);

		}
		Arrays.sort(data);

	}
	public int searchInArray(int searchInt){
		int low=0;
		int high=data.length-1;
		int mid=(low+high +1)/2;
		int position=-1;
		do{
			System.out.print(remainingElements(low,high));
			for (int i = 0; i < mid; i++) {
				System.out.print("   ");//three space, 2 for digit 1 for blank space
			}
			System.out.println("*");
			
			if(searchInt ==data[mid])
				position=mid;
			else if(searchInt <data[mid])
				high=mid-1;
			else
				low=mid+1;
			
			mid=(low+high +1)/2;
		}while((low<=high)&&(position ==-1));
		
		return position;
	}
	public String remainingElements(int low,int high){
		StringBuilder temporary=new StringBuilder();
		
		for (int i = 0; i < low; i++) {
			temporary .append("   ");//three space, 2 for digit 1 for blank space
		}
		
		for (int i = low; i <=high; i++) {
			temporary.append(data[i]+" ");//total three space_holder, 2 for digit 1 for blank space
		}
		temporary .append("\n");
		return temporary .toString();
	}
	@Override
	public String toString() {
		return remainingElements(0, data.length-1);
	}

}
