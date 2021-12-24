
/**
 * Write a description of class asdf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class asdf
{
        public static void main (String [] args) {

    String whateverBeta = "chess";
    int words = 1;
    int cheese = 1;
    String doge = "";
    if (whateverBeta.isEmpty()) {
    System.out.println("Zero Words");
    System.exit(0);
    }
    int whateverBetaCount = whateverBeta.length();
    for (int testy = 0; testy < whateverBetaCount; testy++){
            String dog = whateverBeta.substring(testy, cheese);
            if(dog.equals(" ")){
                words ++;
            }
            cheese++;
    }
System.out.println("Number of words: " + words);
}
}
