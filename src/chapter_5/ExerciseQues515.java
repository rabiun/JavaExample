package chapter_5;

public class ExerciseQues515
{

	
	public static void main(String[] args) 
	{  
		//first problem (a)
		for (int i = 1; i <=10; i++) 
		{
			for (int j = 1; j <=i; j++) {
				System .out.print("*");
			}
			System .out.println();
		}
		
		System .out.println();
		
	    //Second problem (b)		
		for (int i = 10; i >= 1; i--)
		{
			for (int j = 1; j <=i; j++) 
			{
				System .out.print("*");
			}
			System .out.println();
		}
		
		System .out.println();
		
		//Third  problem (c)
		for (int i = 10; i >= 1; i--)
		{
			
				int z=10-i;
				while(z>0)
				{
					System .out.print(" ");
					--z;
			    }
			
			
			for (int j = 1; j <=i; j++) 
			{
				System .out.print("*");
			}
			
			System .out.println();
		}
		
		System .out.println();
		//Forth problem (d)
		for (int i = 1; i <=10; i++) 
		{   
			int z=10-i;
			while(z>0)
			{
				System .out.print(" ");
				--z;
		    }
			
			for (int j = 1; j <=i; j++) {
				System .out.print("*");
			}
			
			System .out.println();
		}
		
	}

}
