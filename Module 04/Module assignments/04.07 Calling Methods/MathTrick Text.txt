/**
 * 
 * @Evan Wang
 * @1.0 12/22/2021
 * 
 * This Math trick and many more can be found at: http://www.pleacher.com/handley/puzzles/mtricks.html
 *
 */

public class MathTrick {
    public static int getRandomNum() 
    {    
        int firstDigit = (int)(Math.random() * 6);
        int lastDigit = (int)(Math.random() * (9-7+1) +7);
        int middleDigit = (int)(Math.random() *10 );
        String firstDigitV2 = String.valueOf(firstDigit);
        String lastDigitV2 = String.valueOf(lastDigit);
        String middleDigitV2= String.valueOf(middleDigit);
        String numAlpha = firstDigitV2 + middleDigitV2 + lastDigitV2;
        int num = Integer.parseInt(numAlpha);
        return num;
    }
        public static int reverseDigits (int firstDigit, int lastDigit, int middleDigit) {
            getRandomNum();
            int reverseDigit = ((((((0 * 10) + lastDigit) * 10) + middleDigit) * 10) + firstDigit);
            return reverseDigit;
        } 
        public static int difference (int num, int reverseDigit) {
            int difference = 0;
        if (reverseDigit > num) {
           difference = reverseDigit - num;
           }
           else {
               difference = num - reverseDigit;
           }
      return difference;
        }
        public static int reverseFinalDifference (int difference) {
            String differenceV2 = String.valueOf(difference);
            String differenceFirstDigit = "";
            String differenceSecondDigit = "";
            String differenceFinalDigit = "";
            String reverseDifference = "";
            if (difference >= 100) {
                differenceFirstDigit = differenceV2.substring(0);
                differenceSecondDigit = differenceV2.substring(1);
                differenceFinalDigit = differenceV2.substring(2);
                reverseDifference = differenceFinalDigit + differenceSecondDigit + differenceFirstDigit;
            }
            else {
                differenceFirstDigit = differenceV2.substring(0);
                differenceFinalDigit = differenceV2.substring(1);
                reverseDifference = differenceFinalDigit + differenceFirstDigit;
            }
            int reverseFinalDifference = Integer.parseInt(reverseDifference);
                return reverseFinalDifference;
                
        }
        public static int timeOneMillion (int reverseFinalDifference) {
        int timeOneMillion = reverseFinalDifference * 1000000;
        return timeOneMillion;
        }
        public static int massiveSubtraction (int timeOneMillion) {
            int massiveSubtraction = timeOneMillion - 733361573; 
            //interesting how 10 million is to large for java
                        System.out.println(massiveSubtraction);

            return massiveSubtraction;
        }
    // Step 7) replace characters in a String according to the chart
    // Hint: Loop through the String and "replace" the numbers with the corresponding letter
    public static String replaceLtr(String str, int massiveSubtraction)
    {
            String massiveSubtractionV2 = String.valueOf(massiveSubtraction);
            String one = massiveSubtractionV2.substring(0);
            String two = massiveSubtractionV2.substring(1);
            String three = massiveSubtractionV2.substring(2);
            String four = massiveSubtractionV2.substring(3);
            String five = massiveSubtractionV2.substring(4);
            String six = massiveSubtractionV2.substring(5);
            String seven = massiveSubtractionV2.substring(6);
            String eight = massiveSubtractionV2.substring(7);
            String oneV2 = "";
            String twoV2 = "";
            String threeV2 = "";
            String fourV2 ="";
            String fiveV2 = "";
            String sixV2 = "";
            String sevenV2 = "";
            String eightV2 = "";
            if (two == "0") {
                 twoV2 = "Y";
            }
            else if (two == "1") {
                 twoV2 = "M";
       }
       else if (two == "2") {
            twoV2 = "P";
        }
               else if (two == "3") {
            twoV2 = "L";
        }
               else if (two == "4") {
            twoV2 = "R";
        }
               else if (two == "5") {
            twoV2 = "O";
        }
               else if (two == "6") {
            twoV2 = "F";
        }
               else if (two == "7") {
            twoV2 = "A";
        }
               else if (two == "8") {
            twoV2 = "I";
        }
               else {
            twoV2 = "B";
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
    // Step 8) reverse the letters in a String
    // Hint: start with an empty String variable 
    //         loop through the original word   
    //         add one letter at time to the new variable using concatenation and .substring()
    public static String reverseString(String str, String oneV2, String twoV2, String threeV2, String fourV2, String fiveV2, String sixV2, String sevenV2, String eightV2) {
        String reverseNumToLetter = eightV2 + sevenV2 + sixV2 + fiveV2+ fourV2+ threeV2+ twoV2+ oneV2;
        return reverseNumToLetter;
    }
        
    public static void main(String[] args, int num, int reverseDigit, 
    int difference, int reverseFinalDifference, int timeOneMillion, 
    int massiveSubtraction, String numToLetter,String reverseNumToLetter) 
    {
//        1.    Generate a random 3-digit number so that the first and third digits differ by more than one.
        System.out.println("1. \t" + "The Starting Number: " + num);
//        2.    Now reverse the digits to form a second number.
        System.out.println("2. \t" + "The Reversed Number: " + reverseDigit);
//        3.    Subtract the smaller number from the larger one.
        System.out.println("3. \t" + "The Difference Is: " + difference);
//        4.    Now reverse the digits in the answer you got in step 3 and add it to that number.
        System.out.println("4. \t" + "The reversed number added to difference: " + reverseFinalDifference);
//        5.    Multiply by one million.
        System.out.println("5. \t" + "The Number * one million: " + timeOneMillion);
//        6.    Subtract 733,361,573.
        System.out.println("6. \t" + "Number subtracted by 733,361,573: " + massiveSubtraction);
//        7.    Convert the number to a string in order to replace the numbers with letters.
//                 Ex: String str = String.valueOf(myNumber);
//            Then, replace each of the digits in your answer, with the letter it corresponds to using the table in the instructions.
        System.out.println("7. \t" + "Replacing the Digits to Letters: " + numToLetter);
//        8.    Now reverse the letters in the string to read your message backward.
        System.out.println("8. \t" + "Reversing the String: " + reverseNumToLetter);
    } // end main
} // end class