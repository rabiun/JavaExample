package chapter_30;

public class StringMiscellaneous 
{
	public static void main( String args[] )
	   {
	      String s1 = "hello there";
	      char charArray[] = new char[ 5 ];

	      System.out.printf( "s1: %s", s1 );

	      // test length method
	      System.out.printf( "\nLength of s1: %d", s1.length() );

	      // loop through characters in s1 with charAt and display reversed
	      System.out.print( "\nThe string reversed is: " );

	      for ( int count = s1.length() - 1; count >= 0; count-- )
	         System.out.printf( "%s", s1.charAt( count ) );

	      // copy characters from string into charArray
	      s1.getChars( 0, 5, charArray, 0 );
	      System.out.print( "\nThe character array is: " );

	      for ( char character : charArray )
	         System.out.print( character );
	      //------------------------------------------------------------------------------------
	      //Shortcut method to reverse a string
	      //using class StringBuffer reverse() method and then using ToString() method
	      System.out.println();
	      StringBuffer buffer=new StringBuffer(s1);
	      String reverse=buffer.reverse().toString();
	      System.out.println(reverse);
	     //------------------------------------------------------------------------------------
	  
	      //shortcut is given below
	      System.out.println(new StringBuffer(s1).reverse().toString());
	   } // end main

	
}
