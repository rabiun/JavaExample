package chapter_4;

public class Exercisese_4_22 
{

	
	public static void main(String[] args) 
	{
		System .out.println("N \t 10*N \t 100*N \t 1000*N");
		System .out.println();
		
		for (int i = 1; i<=5;i++)
		{
			
			for (int j = 1; j <= 1000;j*=10)
			{
				System.out.printf("%d  \t",(j*i));
				
			}
			System .out.println();
			
		}
	}

}
