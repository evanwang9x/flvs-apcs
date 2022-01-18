public class Message{

     private int idLength;
     private String deviceID;
     private int msgLength;
     private String textMsg;

     public Message(String msg, int userIDLength){
     idLength = userIDLength;
     }

     public boolean isValid(){
     int deviceIDSize = deviceID.length();
     Boolean isValid;
     if (idLength==deviceIDSize) {
         isValid = true;
     }
     else {
         isValid = false;
     }
     return isValid;
     }

     
     public int wordCount(Boolean isValid){
        if (isValid = false) {
            System.exit(0);
        }
            int length = textMsg.length();
            int i =0;
            int wordCount =0;
            if(length == 0) {
                System.exit(0);
            }
            else if (msgLength != length) {
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
    return wordCount;
    }
}