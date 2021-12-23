/**
 * 
 * @Evan Wang
 * @2.0 12/23/2021
 * 
 * This Math trick and many more can be found at: http://www.pleacher.com/handley/puzzles/mtricks.html
 *
 */

public class MathTrickV2 {
    public static int num (int firstDigit, int lastDigit, int middleDigit){
        String firstDigitV2 = String.valueOf(firstDigit);
        String lastDigitV2 = String.valueOf(lastDigit);
        String middleDigitV2= String.valueOf(middleDigit);
        String numAlpha = firstDigitV2 + middleDigitV2 + lastDigitV2;
        int num = Integer.parseInt(numAlpha);
        return num;
    }
    
    public static int reverseNum (int numRemastered) {
            int digits = numRemastered;
            String digitsString = String.valueOf(digits);
            String digitsString0 = digitsString.substring(0);
            String digitsString1 = digitsString.substring(1);
            String digitsString2 = digitsString.substring(2);
            int digitsInt0 = Integer.parseInt(digitsString0);
            int digitsInt1 = Integer.parseInt(digitsString1);
            int reverseDigits = ((((digits%10)*10)+((digits/10)%10))*10) + digits/100;
            System.out.println(digits);
            return reverseDigits;
    }
    
    public static int difference (int numRemastered, int reverseNumRemastered) {
            int altNum = numRemastered;
            int altReverseDigit = reverseNumRemastered;
            int difference = 0;
        if (altReverseDigit > altNum) {
           difference = altReverseDigit - altNum;
           }
           else {
               difference = altNum - altReverseDigit;
           }
      return difference;
    }
    
    public static int reverseFinalDifference (int differenceRemastered) {
        int differenceAlpha = differenceRemastered;
        int reverseDigits = ((((differenceAlpha%10)*10)+((differenceAlpha/10)%10))*10) + differenceAlpha/100;
        int reverseFinalDifference = differenceAlpha + reverseDigits;

        return reverseFinalDifference;
    }
    
    public static int timeOneMillion (int reverseFinalDifferenceRemastered) {
        int timeOneMillion = reverseFinalDifferenceRemastered * 1000000;
        return timeOneMillion;
        }
        
    public static String massiveSubtraction (int timeOneMillionRemastered) {
            int massiveSubtractionAlpha = timeOneMillionRemastered - 733361573;
            String massiveSubtraction = Integer.toString(massiveSubtractionAlpha);
            return massiveSubtraction;
        }
        
         public static String replaceLtr(String massiveSubtractionRemastered)
    {
            String massiveSubtractionV2 = String.valueOf(massiveSubtractionRemastered);
            String one = massiveSubtractionV2.substring(0);
            String two = massiveSubtractionV2.substring(1);
            String three = massiveSubtractionV2.substring(2);
            String four = massiveSubtractionV2.substring(3);
            String five = massiveSubtractionV2.substring(4);
            String six = massiveSubtractionV2.substring(5);
            String seven = massiveSubtractionV2.substring(6);
            String eight = massiveSubtractionV2.substring(7);
            
            int oneRemastered = Integer.parseInt(one);
            int twoRemastered = Integer.parseInt(two);
            int threeRemastered = Integer.parseInt(three);
            int fourRemastered = Integer.parseInt(four);
            int fiveRemastered = Integer.parseInt(five);
            int sixRemastered = Integer.parseInt(six);
            int sevenRemastered = Integer.parseInt(seven);
            int eightRemastered = Integer.parseInt(eight);
            
            String oneV2 = "";
            String twoV2 = "";
            String threeV2 = "";
            String fourV2 ="";
            String fiveV2 = "";
            String sixV2 = "";
            String sevenV2 = "";
            String eightV2 = "";
        if (twoRemastered == 0) {
                 twoRemasteredV2 = "Y";
            }
            else if (twoRemastered == 1) {
                 twoRemasteredV2 = "M";
       }
               else if (twoRemastered == 2) {
            twoRemasteredV2 = "P";
        }
               else if (twoRemastered == 3) {
            twoRemasteredV2 = "L";
        }
               else if (twoRemastered == 4) {
            twoRemasteredV2 = "R";
        }
               else if (twoRemastered == 5) {
            twoRemasteredV2 = "O";
        }
               else if (twoRemastered == 6) {
            twoRemasteredV2 = "F";
        }
               else if (twoRemastered == 7) {
            twoRemasteredV2 = "A";
        }
               else if (twoRemastered == 8) {
            twoRemasteredV2 = "I";
        }
               else {
            twoRemasteredV2 = "B";
        }
    
             if (three == "0") {
                 threeV2 = "Y";
            }
            else if (three == "1") {
                 threeV2 = "M";
       }
       else if (three == "2") {
            threeV2 = "P";
        }
               else if (three == "3") {
            threeV2 = "L";
        }
               else if (three == "4") {
            threeV2 = "R";
        }
               else if (three == "5") {
            threeV2 = "O";
        }
               else if (three == "6") {
            threeV2 = "F";
        }
               else if (three == "7") {
            threeV2 = "A";
        }
               else if (three == "8") {
            threeV2 = "I";
        }
               else {
            threeV2 = "B";
        }
        if (four == "0") {
                 fourV2 = "Y";
            }
            else if (four == "1") {
                 fourV2 = "M";
       }
       else if (four == "2") {
            fourV2 = "P";
        }
               else if (four == "3") {
            fourV2 = "L";
        }
               else if (four == "4") {
            fourV2 = "R";
        }
               else if (four == "5") {
            fourV2 = "O";
        }
               else if (four == "6") {
            fourV2 = "F";
        }
               else if (four == "7") {
            fourV2 = "A";
        }
               else if (four == "8") {
            fourV2 = "I";
        }
               else {
            fourV2 = "B";
        }
                     if (five == "0") {
                 fiveV2 = "Y";
            }
            else if (five == "1") {
                 fiveV2 = "M";
       }
       else if (five == "2") {
            fiveV2 = "P";
        }
               else if (five == "3") {
            fiveV2 = "L";
        }
               else if (five == "4") {
            fiveV2 = "R";
        }
               else if (five == "5") {
            fiveV2 = "O";
        }
               else if (five == "6") {
            fiveV2 = "F";
        }
               else if (five == "7") {
            fiveV2 = "A";
        }
               else if (five == "8") {
            fiveV2 = "I";
        }
               else {
            fiveV2 = "B";
        }
                     if (six == "0") {
                 sixV2 = "Y";
            }
            else if (six == "1") {
                 sixV2 = "M";
       }
       else if (six == "2") {
            sixV2 = "P";
        }
               else if (six == "3") {
            sixV2 = "L";
        }
               else if (six == "4") {
            sixV2 = "R";
        }
               else if (six == "5") {
            sixV2 = "O";
        }
               else if (six == "6") {
            sixV2 = "F";
        }
               else if (six == "7") {
            sixV2 = "A";
        }
               else if (six == "8") {
            sixV2 = "I";
        }
               else {
            threeV2 = "B";
        }
                     if (seven == "0") {
                 threeV2 = "Y";
            }
            else if (seven == "1") {
                 threeV2 = "M";
       }
       else if (seven == "2") {
            sevenV2 = "P";
        }
               else if (seven == "3") {
            sevenV2 = "L";
        }
               else if (seven == "4") {
            sevenV2 = "R";
        }
               else if (seven == "5") {
            sevenV2 = "O";
        }
               else if (seven == "6") {
            sevenV2 = "F";
        }
               else if (seven == "7") {
            sevenV2 = "A";
        }
               else if (seven == "8") {
            sevenV2 = "I";
        }
               else {
            sevenV2 = "B";
        }
                if (eight == "0") {
                 eightV2 = "Y";
            }
            else if (eight == "1") {
                 eightV2 = "M";
       }
       else if (eight == "2") {
            eightV2 = "P";
        }
               else if (eight == "3") {
            eightV2 = "L";
        }
               else if (eight == "4") {
            eightV2 = "R";
        }
               else if (eight == "5") {
            eightV2 = "O";
        }
               else if (eight == "6") {
            eightV2 = "F";
        }
               else if (eight == "7") {
            eightV2 = "A";
        }
               else if (eight == "8") {
            eightV2 = "I";
        }
               else {
            eightV2 = "B";
        }
    String numToLetter = oneV2 + twoV2 + threeV2 + fourV2 + fiveV2 + sixV2 + sevenV2 + eightV2;
    return numToLetter;
}
    public static void main (String [] args) {
        int firstDigit = (int)(Math.random() * 6);
        int lastDigit = (int)(Math.random() * (9-7+1) +7);
        int middleDigit = (int)(Math.random() *10 );
        
        int numRemastered = num(firstDigit, lastDigit, middleDigit);
        int reverseDigitsRemastered = reverseNum(numRemastered);
        int differenceRemastered = difference(numRemastered, reverseDigitsRemastered);
        int reverseFinalDifferenceRemastered = reverseFinalDifference(differenceRemastered);
        int timeOneMillionRemastered = timeOneMillion(reverseFinalDifferenceRemastered);
        String massiveSubtractionRemastered = massiveSubtraction(timeOneMillionRemastered);
        String replaceLtrRemastered = replaceLtr(massiveSubtractionRemastered);
        
        System.out.println("The starting number: " + numRemastered);
        System.out.println("The reversed number: " + reverseDigitsRemastered);
        System.out.println("The difference is: " + differenceRemastered);
        System.out.println("The reversed number of difference added to difference " + reverseFinalDifferenceRemastered);
        System.out.println("Number times one million: " + timeOneMillionRemastered);
        System.out.println("Number subtraced and converted to String: " + massiveSubtractionRemastered);
        System.out.println("Replaced string: " + replaceLtrRemastered);
    }
}
