
/**
 * Write a description of class CircleTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleTester
{
    public static void main (String [] args) {
            String textMsg = "hello there boomers";
            int length = textMsg.length();
            int i =0;
            int wordCount =0;
            if(length == 0) {
                System.exit(0);
            }
            else {
                wordCount = 1;
            }

            while (i < length) {
            String character = textMsg.substring(i, i+1);
            if (character.equals(" "))
            {
                wordCount++;
            }
            i++;

    }
    System.out.println(wordCount);
}
}

