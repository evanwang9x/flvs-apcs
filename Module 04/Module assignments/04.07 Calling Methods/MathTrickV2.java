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
            String massiveSubtractionV2 = massiveSubtractionRemastered;
            
            String one = massiveSubtractionV2.substring(0,1);
            String two = massiveSubtractionV2.substring(1,2);
            String three = massiveSubtractionV2.substring(2,3);
            String four = massiveSubtractionV2.substring(3,4);
            String five = massiveSubtractionV2.substring(4,5);
            String six = massiveSubtractionV2.substring(5,6);
            String seven = massiveSubtractionV2.substring(6,7);
            String eight = massiveSubtractionV2.substring(7,8);
            String nine= massiveSubtractionV2.substring(8,9);
            
            
            int oneRemastered = (Integer.parseInt(one));
            int twoRemastered = Integer.parseInt(two);
            int threeRemastered = Integer.parseInt(three);
            int fourRemastered = Integer.parseInt(four);
            int fiveRemastered = Integer.parseInt(five);
            int sixRemastered = Integer.parseInt(six);
            int sevenRemastered = Integer.parseInt(seven);
            int eightRemastered = Integer.parseInt(eight);
            int nineRemastered = Integer.parseInt(nine);
            
            System.out.println(oneRemastered);            
            String oneRemasteredV2 = "";
            String twoRemasteredV2 = "";
            String threeRemasteredV2 = "";
            String fourRemasteredV2 ="";
            String fiveRemasteredV2 = "";
            String sixRemasteredV2 = "";
            String sevenRemasteredV2 = "";
            String eightRemasteredV2 = "";
            String nineRemasteredV2 = "";
       if (oneRemastered == 0) {
                 oneRemasteredV2 = "Y";
            }
            else if (oneRemastered == 1) {
                 oneRemasteredV2 = "M";
       }
               else if (oneRemastered == 2) {
            oneRemasteredV2 = "P";
        }
               else if (oneRemastered == 3) {
            oneRemasteredV2 = "L";
        }
               else if (oneRemastered == 4) {
            oneRemasteredV2 = "R";
        }
               else if (oneRemastered == 5) {
            oneRemasteredV2 = "O";
        }
               else if (oneRemastered == 6) {
            oneRemasteredV2 = "F";
        }
               else if (oneRemastered == 7) {
            oneRemasteredV2 = "A";
        }
               else if (oneRemastered == 8) {
            oneRemasteredV2 = "I";
        }
               else {
            oneRemasteredV2 = "P";
        }     
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
    
       if (threeRemastered == 0) {
                 threeRemasteredV2 = "Y";
            }
            else if (threeRemastered == 1) {
                 threeRemasteredV2 = "M";
       }
       else if (threeRemastered == 2) {
            threeRemasteredV2 = "P";
        }
               else if (threeRemastered == 3) {
            threeRemasteredV2 = "L";
        }
               else if (threeRemastered == 4) {
            threeRemasteredV2 = "R";
        }
               else if (threeRemastered == 5) {
            threeRemasteredV2 = "O";
        }
               else if (threeRemastered == 6) {
            threeRemasteredV2 = "F";
        }
               else if (threeRemastered == 7) {
            threeRemasteredV2 = "A";
        }
               else if (threeRemastered == 8) {
            threeRemasteredV2 = "I";
        }
               else {
            threeRemasteredV2 = "B";
        }
       if (fourRemastered == 0) {
                 fourRemasteredV2 = "Y";
            }
            else if (fourRemastered == 1) {
                 fourRemasteredV2 = "M";
       }
       else if (fourRemastered == 2) {
            fourRemasteredV2 = "P";
        }
               else if (fourRemastered == 3) {
            fourRemasteredV2 = "L";
        }
               else if (fourRemastered == 4) {
            fourRemasteredV2 = "R";
        }
               else if (fourRemastered == 5) {
            fourRemasteredV2 = "O";
        }
               else if (fourRemastered == 6) {
            fourRemasteredV2 = "F";
        }
               else if (fourRemastered == 7) {
            fourRemasteredV2 = "A";
        }
               else if (fourRemastered == 8) {
            fourRemasteredV2 = "I";
        }
               else {
            fourRemasteredV2 = "B";
        }
       if (fiveRemastered == 0) {
                 fiveRemasteredV2 = "Y";
            }
            else if (fiveRemastered == 1) {
                 fiveRemasteredV2 = "M";
       }
       else if (fiveRemastered == 2) {
            fiveRemasteredV2 = "P";
        }
               else if (fiveRemastered == 3) {
            fiveRemasteredV2 = "L";
        }
               else if (fiveRemastered == 4) {
            fiveRemasteredV2 = "R";
        }
               else if (fiveRemastered == 5) {
            fiveRemasteredV2 = "O";
        }
               else if (fiveRemastered == 6) {
            fiveRemasteredV2 = "F";
        }
               else if (fiveRemastered == 7) {
            fiveRemasteredV2 = "A";
        }
               else if (fiveRemastered == 8) {
            fiveRemasteredV2 = "I";
        }
               else {
            fiveRemasteredV2 = "B";
        }
                     if (sixRemastered == 0) {
                 sixRemasteredV2 = "Y";
            }
            else if (sixRemastered == 1) {
                 sixRemasteredV2 = "M";
       }
       else if (sixRemastered == 2) {
            sixRemasteredV2 = "P";
        }
               else if (sixRemastered == 3) {
            sixRemasteredV2 = "L";
        }
               else if (sixRemastered == 4) {
            sixRemasteredV2 = "R";
        }
               else if (sixRemastered == 5) {
            sixRemasteredV2 = "O";
        }
               else if (sixRemastered == 6) {
            sixRemasteredV2 = "F";
        }
               else if (sixRemastered == 7) {
            sixRemasteredV2 = "A";
        }
               else if (sixRemastered == 8) {
            sixRemasteredV2 = "I";
        }
               else {
            sixRemasteredV2 = "B";
        }
       if (sevenRemastered == 0) {
                 sevenRemasteredV2 = "Y";
            }
            else if (sevenRemastered == 1) {
                 sevenRemasteredV2 = "M";
       }
       else if (sevenRemastered == 2) {
            sevenRemasteredV2 = "P";
        }
               else if (sevenRemastered == 3) {
            sevenRemasteredV2 = "L";
        }
               else if (sevenRemastered == 4) {
            sevenRemasteredV2 = "R";
        }
               else if (sevenRemastered == 5) {
            sevenRemasteredV2 = "O";
        }
               else if (sevenRemastered == 6) {
            sevenRemasteredV2 = "F";
        }
               else if (sevenRemastered == 7) {
            sevenRemasteredV2 = "A";
        }
               else if (sevenRemastered == 8) {
            sevenRemasteredV2 = "I";
        }
               else {
            sevenRemasteredV2 = "B";
        }
       if (eightRemastered == 0) {
                 eightRemasteredV2 = "Y";
            }
            else if (eightRemastered == 1) {
                 eightRemasteredV2 = "M";
       }
       else if (eightRemastered == 2) {
            eightRemasteredV2 = "P";
        }
               else if (eightRemastered == 3) {
            eightRemasteredV2 = "L";
        }
               else if (eightRemastered == 4) {
            eightRemasteredV2 = "R";
        }
               else if (eightRemastered == 5) {
            eightRemasteredV2 = "O";
        }
               else if (eightRemastered == 6) {
            eightRemasteredV2 = "F";
        }
               else if (eightRemastered == 7) {
            eightRemasteredV2 = "A";
        }
               else if (eightRemastered == 8) {
            eightRemasteredV2 = "I";
        }
               else {
            eightRemasteredV2 = "B";
        }
        if (nineRemastered == 0) {
                 nineRemasteredV2 = "Y";
            }
            else if (nineRemastered == 1) {
                 nineRemasteredV2 = "M";
       }
               else if (nineRemastered == 2) {
            nineRemasteredV2 = "P";
        }
               else if (nineRemastered == 3) {
            nineRemasteredV2 = "L";
        }
               else if (nineRemastered == 4) {
            nineRemasteredV2 = "R";
        }
               else if (nineRemastered == 5) {
            nineRemasteredV2 = "O";
        }
               else if (nineRemastered == 6) {
            nineRemasteredV2 = "F";
        }
               else if (nineRemastered == 7) {
            nineRemasteredV2 = "A";
        }
               else if (nineRemastered == 8) {
            nineRemasteredV2 = "I";
        }
               else {
            nineRemasteredV2 = "B";
        }
    String numToLetter = oneRemasteredV2 + twoRemasteredV2 + threeRemasteredV2 + fourRemasteredV2 + fiveRemasteredV2 + sixRemasteredV2 + sevenRemasteredV2 + eightRemasteredV2 + nineRemasteredV2;
    return numToLetter;
}
    public static String reverseStringLtr (String replaceLtrRemastered) {
        String reverseStringLtr = replaceLtrRemastered;
            String one = reverseStringLtr.substring(0,1);
            String two = reverseStringLtr.substring(1,2);
            String three = reverseStringLtr.substring(2,3);
            String four = reverseStringLtr.substring(3,4);
            String five = reverseStringLtr.substring(4,5);
            String six = reverseStringLtr.substring(5,6);
            String seven = reverseStringLtr.substring(6,7);
            String eight = reverseStringLtr.substring(7,8);
            String nine= reverseStringLtr.substring(8,9); 
        String reverseStringLtrSuper = nine + eight + seven + six + five + four + three + two + one;
        return reverseStringLtrSuper;
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
        String reverseStringLtrSuperRemastered = reverseStringLtr(replaceLtrRemastered);
        
        System.out.println("The starting number: " + numRemastered);
        System.out.println("The reversed number: " + reverseDigitsRemastered);
        System.out.println("The difference is: " + differenceRemastered);
        System.out.println("The reversed number of difference added to difference " + reverseFinalDifferenceRemastered);
        System.out.println("Number times one million: " + timeOneMillionRemastered);
        System.out.println("Number subtraced and converted to String: " + massiveSubtractionRemastered);
        System.out.println("Replaced string: " + replaceLtrRemastered);
        System.out.println("Reversed String: " + reverseStringLtrSuperRemastered);
    }
}
