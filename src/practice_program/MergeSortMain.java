package practice_program;

public class MergeSortMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] numbers=new int[]{2,4,1,6,8,5,3,7};
		
		//int[] num1=new int[]{1,2,4,6};
		//int[] num2=new int[]{3,5,7,7};
		//int[] numbersRes=merge(num1,num2,numbers);
		
		//
		mergeSort(numbers);
		for (int value : numbers ) {
			System.out.print(value +" ");
		

		}

	}

	private static void mergeSort(int[] a) {
		int n=a.length;
		
		if(n<2)
			return;
		
		int mid=(int)Math.floor((n)/2);
		
		int[] left=new int[mid];
		int[] right=new int[n-mid];
		
		for (int i = 0; i < mid; i++) {
			left[i]=a[i];
		}
		for (int i = mid; i < n; i++) {
			right[i-mid]=a[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left,right,a);
	}

	private static void merge(int[] L, int[] R, int[] a) {
		int nL=L.length;
		int nR=R.length;
		int i=0,j=0,k=0;//left array index =i, right array index =j,array a index =k
		
		while (i<nL && j<nR) {
			if(L[i]<=R[j]){
				a[k]=L[i];
				i++;
			}
			else{
				a[k]=R[j];
				j++;
			}
			k++;
		}
		while (i<nL) {
			a[k]=L[i];
			i++;
			k++;
		}
		while (j<nL) {
			a[k]=R[j];
			j++;
			k++;
		}
		
	}
	
}
