
/**
 *To help you test your arrays.
 *
 *Evan Wang
 *4/20/2022
 */
public class ArrayTester
{
    public static void main (String [] args) {
        Array[] unsortedArray = new Array[10];
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
    }
}
