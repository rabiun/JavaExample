package mum_sample_example;

public class Ques_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(a2(new int[] {1}));
		
		System.out.println(a2(new int[] {1, 2}));
		
		System.out.println(a2(new int[] {1, 2, 3}));
		
		System.out.println(a2(new int[] {1, 2, 3, 4}));
		
		System.out.println(a2(new int[] {3, 3, 4, 4}));
		
		System.out.println(a2(new int[] {3, 2, 3, 4}));
		
		System.out.println(a2(new int[] {4, 1, 2, 3}));
		
		System.out.println(a2(new int[] {1, 1}));
		
		System.out.println(a2(new int[] {}));
		
	}
	static int a2(int[] a){
		int sumOfOdd=0;
		int sumOfEven=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
				sumOfEven+=a[i];
			else
				sumOfOdd+=a[i];
			
		}
		return sumOfOdd-sumOfEven;
	}

}
