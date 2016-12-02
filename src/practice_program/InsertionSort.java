package practice_program;

public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] numbers=new int[]{7,2,4,1,5,3};
		
		insertionSort(numbers);
		
		for (int value : numbers) {
			System.out.print(value +" ");
		}

	}

	private static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int value=a[i];
			int hole=i;
			while (hole>0 && a[hole-1]>value) {
				a[hole]=a[hole-1];
				hole--;
			}
			a[hole]=value;
		}
		
	}

}
