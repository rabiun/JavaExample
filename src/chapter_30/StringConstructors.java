package chapter_30;

public class StringConstructors 
{

	
	public static void main(String[] args) 
	{
		char charArray[] = { 'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y' };
	      String s = new String( "hello" );
	     //s="change";

	      // use String constructors
	      String s1 = new String();
	      String s2 = new String( s );
	      String s3 = new String( charArray );
	      String s4 = new String( charArray, 6, 3 );

	      System.out.printf(
	         "s1 = %s\ns2 = %s\ns3 = %s\ns4 = %s\n", 
	         s1, s2, s3, s4 ); // display strings
	     s="change";
	      
	     System.out.println(s);//why it can can modify ?
	      
	      
	      
	      String test="good";
	      test=" world";//why it can can modify ?
	      System.out.println(test);
	      String test1="good";
	      
	      if(test==test1)
	      {
	    	  System.out.println("same string object in memory location");
	    	  
	      }
	      else
	    	  System.out.println("not in same memory location");

	}

}
