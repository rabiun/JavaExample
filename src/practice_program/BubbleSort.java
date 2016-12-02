package practice_program;

public class BubbleSort {

	/**
	 * Bubble sort optimized
	 */
	public static void main(String[] args) 
	{
		int a[]=new int[]{11,10,5,6,7,8,9};
		
		System.out.println("Before sorting :"); 
		for (int value:a) 
		{
			System.out.printf("%d  ",value);
			
		}
		System.out.println();
		
		int i;
		for ( i = 0; i < a.length-1; i++) 
		{
			
			boolean isSorted=true;
			for (int j = 0; j < a.length-i-1; j++)
			{
				
				if(a[j]>a[j+1]) 
				{
					int swapValue=a[j];
					a[j]=a[j+1];
					a[j+1]=swapValue ;
					isSorted=false;
				}
				
			}
			
			if(isSorted)
			{
				System.out.printf("Sorted after checking %d passes: %d-pass for sorting and 1- extra pass for re-check\n",i+1,i);//for not run extra loop 
				break;
			}
		}
			
		System.out.println("After sorting :"); 
		for (int value:a) 
		{
			System.out.printf("%d  ",value);
			
		}
		
	}

}
