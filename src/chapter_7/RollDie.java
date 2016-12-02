package chapter_7;

// Fig. 7.7: RollDie.java
// Die-rolling program using arrays instead of switch.
import java.util.Random;

public class RollDie 
{
   public static void main( String[] args )
   {
      Random randomNumbers=new Random();
      int[] frequencies=new int[7];
      
      for (int i = 1; i <=6000; i++) 
      {
    	  ++frequencies [1+randomNumbers .nextInt(6)];
		}
      System .out.printf("%s%12s\n","Face","Frequency");
      for (int face = 1; face < frequencies.length; face++) {
		System.out.printf("%2d%12d\n",face,frequencies[face] );
	}
   } // end main
} // end class RollDie



/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
