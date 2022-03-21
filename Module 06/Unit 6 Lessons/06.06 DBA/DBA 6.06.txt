
/**
 * Write a description of class WordTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordTester
{


private String [] myWords;
private int myNumWords;
private String myTargetWord;
public WordTester(String [] words, int numWords, String targetWord)
{

myWords = words;
myNumWords = numWords;
myTargetWord = targetWord;

}
public boolean isWithin()
{
    int totalWords = myWords.length;
    boolean cancel = false;
    while (cancel != true) {
    for (int i = 0; i < totalWords; i++) {
    if (myTargetWord.compareTo(myWords[i]) == 0 ){
        cancel = true;
        }
    }
}
return cancel;
}
public boolean sameNumber()
{
    int totalWords = myWords.length;
    boolean result;
    if (totalWords == myNumWords) {
        result = true;
    } else {
        result = false;
    }
    return result;
}
}

