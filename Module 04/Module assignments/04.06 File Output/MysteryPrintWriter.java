
/**
 * The purpose of this program is to demonstrate how to write information to
 * a text file on the hard disk.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
class MysteryPrintWriter
{
   public static void main (String [ ] args) throws IOException
   {
          String head = "construction";
    String tail = "";
    if ( head.length() > 5 && "building".compareTo( head ) < 0 )
    {
      tail = head.substring( 5 );
      head = head.substring( 0, 5 );
       
      if ( tail.length() > 5 && "traction".compareTo( tail ) < 0 )
      {
        head += tail.substring( 0, 5 );
        tail = tail.substring( 5 );
      }
    }
    System.out.println( tail );
   }//end of main method
}//end of class