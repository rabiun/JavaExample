package practice_program;

public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] numbers=new int[]{1,5,6,4,2};
		
		System.out.print("Before sorting :"); 
		for (int value:numbers) 
		{
			System.out.printf("%d  ",value);
			
		}
		System.out.println();
		selectionSort(numbers);
		System.out.print("After  sorting :"); 
		for (int value : numbers ) {
			System.out.printf("%d  ",value);
		}

	}

	private static void selectionSort(int[] a) {
		
		for (int i = 0; i < a.length-1; i++) {
			int iMin=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]< a[iMin]){
					iMin=j;
				}
				
			}
			int temp=a[i];
			a[i]=a[iMin];
			a[iMin]=temp;
			
		}
	}

}
