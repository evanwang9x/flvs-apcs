// Java program to count total
// number of words in the string
class GFG
{
    public static int hello (String whatever) {

    String whateverBeta = "Testing Example";
    int words = 0;
    String doge = "";
    if (whateverBeta.isEmpty()) {
    System.out.println("Zero Words");
    System.exit(0);
    }
    int whateverBetaCount = whateverBeta.length();
    for (int testy = 0; testy < whateverBetaCount; testy++){
        String dog = whateverBeta.substring(testy);
            if(dog == " ") {
                words ++;
            }
    }
System.out.println(words);
return words;
}
}

// This code is contributed by Prashant Srivastava