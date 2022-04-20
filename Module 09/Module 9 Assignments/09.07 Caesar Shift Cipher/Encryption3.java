
/**
 *To help you encrypt a message
 *
 *Evan Wang
 *1.0 4/4/22
 */
public class Encryption3
{
    private String alphaText;
    private String newPhrase;
    private String finalText;
    public Encryption3(String text, int userShift) {
        alphaText = text;
        char[] num = text.toCharArray();
        String newPhrase = "";
        for(int i = 0; i < alphaText.length(); i++){
        int temp = (int)num[i] + 2;
        if(temp == 27) {
            temp = 121;
        }
        else if (temp == 28) { 
            temp = 122;
        }
        else if (temp == 123) {
            temp = 97;
        }
         else if (temp == 124) {
            temp = 98;
        }
        char ch = (char)temp;
        newPhrase += ch;
        }
        finalText = newPhrase;
    }
    
    public String getPhrase() {
        return finalText;
    }

    
    
}
