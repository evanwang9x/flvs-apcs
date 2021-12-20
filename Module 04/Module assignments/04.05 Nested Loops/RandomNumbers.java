
/**
 * The purpose of this program is to generate a table of random
 * integers using the Random class nextInt() method.
 *
 * @author Charles Babbage
 * @version 06/05/17
 */
import java.util.Random;
public class RandomNumbers
{
    public static void main(String[] args)
    {
 int count = 1;
for(int outer = 0; outer < 3; outer++)
   for(int inner = 1; inner <= 6; inner+=2)
     count++;
     System.out.println(count);
    }//end main
}//end class