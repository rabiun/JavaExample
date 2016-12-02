package practice_program;

public class armstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num=001;
		
		while(num<=999){
			
			int thirdDigit=num/100;
			int a=num%100;
			int secondDigit=a/10;
			int firstDigit=a%10;
			
			int x=(thirdDigit*thirdDigit*thirdDigit)
					+(secondDigit *secondDigit *secondDigit )
					+(firstDigit*firstDigit*firstDigit );
			if(x==num)
				System.out.printf("The num: %d  is armstrong number\n",num);
			//else
			//	System.out.printf("The num:%d  is not a armstrong number\n",num);
			++num;
		}

	}

}
