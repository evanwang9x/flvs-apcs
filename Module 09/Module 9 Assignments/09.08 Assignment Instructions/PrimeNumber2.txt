
/**
 * To help you find prime numbers and make a password
 *
 *Evan Wang
 *4/5/22
 */
import java.util.Scanner;
 

public class PrimeNumber2
{
public int lowerLimit = 0;
public int upperLimit =0;
public PrimeNumber2(int lowerLimit, int upperLimit) {
    this.lowerLimit = lowerLimit;
    this.upperLimit = upperLimit;
}

public int getTotalPrime () {
    int getTotalPrime = 0;
    
    //To give a starting range 
    for(int i = lowerLimit; i <= upperLimit; i++) { 
        //To start dividing by everything. Automatically adds one when dividing by itself
        if(i% 2 !=0 && i % 3 !=0 && i% 5 !=0) {
            getTotalPrime++;
         }

    } 
    return getTotalPrime;
}


public int[] getAllPrimes () {
    int[] primeList = new int[upperLimit - lowerLimit];
    int k =0; //to help with the array
    //To give a starting range 
    
    for(int i = lowerLimit; i <= upperLimit; i++) { 
        if(i% 2 !=0 && i % 3 !=0 && i% 5 !=0) {
            primeList[k] = i;
            k++;
         }
        
    }
    return primeList;
}

public static void main (String [] args) {
    //Declaration of in for later
    Scanner in;
    in = new Scanner(System.in);

    //Collecting range of prime numbers
    //Array plus an int to store and collect total prime numbers
    System.out.println("Please enter the lower limit of the prime numbers: ");
    int lowLimit = in.nextInt();
    System.out.println("Please enter the upper limit of the prime numbers: ");
    int upLimit = in.nextInt();
    PrimeNumber2 num = new PrimeNumber2(lowLimit, upLimit);
    

    
    System.out.println("Here are the total prime numbers in your range: " + num.getTotalPrime());
    
    int[] arrayGrabber = (num.getAllPrimes());
    int arrayLength = 0;
    for(int i =0; i < arrayGrabber.length; i++) {
        if (arrayGrabber[i]!= 0 ) {
        System.out.println(arrayGrabber[i]);
    }
    }
    
    
    
    
}
}
