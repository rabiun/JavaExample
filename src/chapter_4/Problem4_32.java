package chapter_4;

public class Problem4_32 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean isSpace=true;
		for (int i = 0; i < 8; i++) {
			
			
			for (int j = 0; j < 8; j++) {
				System.out.print("*");
				System.out.print(" ");
				
			}
			System.out.println();
			if(isSpace )
				{
				
				System.out.print(" ");
				isSpace =false;
				
				}
			else{
			
				
			    isSpace =true;
			}
			
		} 
		
	}

}
