
/**
 *To help you test your arrays.
 *
 *Evan Wang
 *4/20/2022
 */
import java.util.Scanner;
public class ArrayTester
{
    public static void main (String [] args) {
        Scanner in;
        in = new Scanner(System.in);
        Array[] unsortedArray = new Array[10];
        Array[] sortedArrayByName = new Array[unsortedArray.length];
        Array[] sortedArrayByProductNumber = new Array[unsortedArray.length];
        Array[] sortedArrayByPrice = new Array[unsortedArray.length];
        unsortedArray[0] = new Array("Chewbacca", 1281, 20, 24);
        unsortedArray[1] = new Array("Dog Leash", 15, 10, 300);
        unsortedArray[2] = new Array("Catnip", 4002, 54, 16);
        unsortedArray[3] = new Array("Playstation 5", 9001, 400, 1);
        unsortedArray[4] = new Array("Flappy Birds", 3033, 5, 9000);
        unsortedArray[5] = new Array("Tennis Ball", 40, 13, 8000);
        unsortedArray[6] = new Array("Doritos", 420, 2, 600);
        unsortedArray[7] = new Array("Lightsaber", 5432, 200, 12);
        unsortedArray[8] = new Array("Mansion", 10000, 10000000, 1);
        unsortedArray[9] = new Array("Toy Plane", 4324, 100, 24);
        
        String format1 = "Name";
        String format2 = "Number";
        String format3 = "Price";
        String format4 = "Quantity";
  

        System.out.println("Here is the unsorted algorithm: ");
        System.out.printf(" %-1s %-10s %-20s %-30s ", format1, format2, format3, format4);
        System.out.println();
        for(int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i].toString());
        }
        
        System.out.println("To name sort by A-Z enter 1 and to sort by Z-A enter 2");
        int userInput = in.nextInt();
        System.out.println("Here is the sorted algorithm using insertion sort: ");
        sortedArrayByName = sortByName(unsortedArray, userInput);
        for(int i = 0; i < unsortedArray.length; i++) {
            System.out.println(sortedArrayByName[i].toString());
        }
        
        System.out.println("To sort product number type 1 to go from lower to up and type 2 for up to down: ");
        int userInputV2 = in.nextInt();
        System.out.println("Here is the sorted algorithm using insertion sort: ");
        sortedArrayByProductNumber = sortByNumber(unsortedArray, sortedArrayByProductNumber, userInputV2);
        for(int i =0; i < unsortedArray.length; i++) {
            System.out.println(sortedArrayByProductNumber[i].toString());
        }
        
        System.out.println("To sort product price by Selection Sort, type 1 for lowest to highest and 2 for highest to lowest: ");
        int userInputV3 = in.nextInt();
        System.out.println("Here is the sorted algorithm using selection sort: ");
        sortByPrice(unsortedArray, userInputV3);
        for(int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i]);
        }
        
        System.out.println("Here is the sorted array by the merge sort method");
        
    }
    
    public static Array[] sortByName(Array[] unsortedArray, int decider) {
        Array[] sortedArray = new Array[unsortedArray.length];
        
        if (decider == 1) {
        for(int i = 0; i < unsortedArray.length; i++) {
            Array next = unsortedArray[i];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0) 
            {
                if(next.getName().compareTo(sortedArray[k-1].getName()) > 0) {
                    insertIndex = k;
                } else {
                    sortedArray[k] = sortedArray [ k-1];
                }
                k--;
            }
            sortedArray[insertIndex] = next;
        }
    }
    else {
        for(int i = 0; i < unsortedArray.length; i++) {
            Array next = unsortedArray[i];
            int insertIndex = 0;
            int k = i;
            while( k > 0 && insertIndex == 0) 
            {
                if(next.getName().compareTo(sortedArray[k-1].getName()) < 0) {
                    insertIndex = k;
                } else {
                    sortedArray[k] = sortedArray [ k-1];
                }
                k--;
            }
            sortedArray[insertIndex] = next;
        }
    }
        return sortedArray;
    }
    
    
    public static Array[] sortByNumber(Array[] unsortedArray, Array[] dest, int decider) {
        
        if(decider == 1) {
        for(int i = 0; i < unsortedArray.length; i++) {
            Array next = unsortedArray[i];
            int insertIndex = 0;
            int k = i;
            while ( k > 0 && insertIndex == 0) {
                if(next.getProductNumber() > unsortedArray[k-1].getProductNumber()) {
                    insertIndex = k;
                }
                else {
                    dest [k] = dest[k-1];
                }
                k--;
            }
            dest[insertIndex] = next;
        }
    } else {
        for(int i = 0; i < unsortedArray.length; i++) {
            Array next = unsortedArray[i];
            int insertIndex = 0;
            int k = i;
            while ( k > 0 && insertIndex == 0) {
                if(next.getProductNumber() < unsortedArray[k-1].getProductNumber()) {
                    insertIndex = k;
                }
                else {
                    dest [k] = dest[k-1];
                }
                k--;
            }
            dest[insertIndex] = next;
        }
    }
        return dest;
    }
    
    
        public static void sortByPrice(Array[] unsortedArray, int determinater2) {
        int determiner = determinater2;
        int i;
        int k;
        int posMax;
        Array temp;
        if(determiner == 1) {
        for ( i = unsortedArray.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                if ( unsortedArray[ k ].getPrice() > unsortedArray[ posMax ].getPrice() )
                    posMax = k;
            }
            temp = unsortedArray[ i ];
            unsortedArray[ i ] = unsortedArray[posMax ];
            unsortedArray[ posMax ] = temp;
        }
        }
        
        else {
           for ( i = unsortedArray.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;

            for ( k = 0 ; k <= i ; k++ )
            {
                if ( unsortedArray[ k ].getPrice() < unsortedArray[ posMax ].getPrice() )
                    posMax = k;
            }
            temp = unsortedArray[ i ];
            unsortedArray[ i ] = unsortedArray[posMax ];
            unsortedArray[ posMax ] = temp;
        }
        }
    }

    public static void sortByQuantity(Array[] unsortedArray, int n) {
        if( n < 2) {
            return;
        }
        int arrayLPrim = unsortedArray.length / 2;
        int arrayRPrim = unsortedArray.length - arrayLPrim;
        
        int arrayL[] = new int [arrayLPrim];
        int arrayR[] = new int [arrayRPrim];
        
        for(int i = 0; i < arrayLPrim; i++) {
            arrayL[i] = unsortedArray[i].getQuantity();
        }
        for(int i = arrayRPrim; i < unsortedArray.length; i++) {
            arrayR[i] = unsortedArray[i].getQuantity();
        }
        
        sortByQuantity(arrayL, arrayLPrim);
        sortByQuantity(arrayR, )
    }
}
