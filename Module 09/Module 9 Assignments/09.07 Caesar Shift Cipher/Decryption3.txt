
/**
 *To help you decrypt a message
 *
 *Evan Wang
 *1.0 4/4/22
 */
public class Decryption3
{
    private String alphaText;
    private String newPhrase;
    private String finalText;
    private int shift;
    public Decryption3(String text, int userShift) {
        alphaText = text;
        shift = userShift;
    }
    
    public String getPhrase() {
        char[] num = alphaText.toCharArray();
        String newPhrase = "";
        for(int i = 0; i < alphaText.length(); i++){
        int temp = (int)num[i] + shift;
        if(temp >= 27) {
            temp = (temp % 26) + 96;
        }
        char ch = (char)temp;
        newPhrase += ch;
        }
        finalText = newPhrase;
        return finalText;
    }
}
