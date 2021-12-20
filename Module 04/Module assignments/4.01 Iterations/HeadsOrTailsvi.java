
import java.util.Scanner;
public class HeadsOrTailsvi
{
public static void main(String[] args)
{
// Declare and initialize variables
int rocksTaken = 0;
int purple = 0;
int yellow = 0;
int totalTotalRockTaken = 20; //change to zero if wish to have any# of rocks taken out
double randNum = 0.0;
//Scanner in = new Scanner(System.in); Uncomment to have any # of rocks taken out

System.out.println("How many colored rocks will you take out? ");
// rocksTaken = in.nextInt(); Uncomment To have any# of rocks taken out
while (rocksTaken <= totalTotalRockTaken) {
    randNum = Math.random();
    System.out.print(rocksTaken + "\t" + randNum);

    if(randNum > 0.4) {
    yellow++;
    System.out.println("\t Yellow Rock");
}
    else {
        purple++;
        System.out.println("\t Purple Rock");
    }
        rocksTaken++;
}
System.out.println();
System.out.println("Number of Yellow Rocks =" + yellow);
System.out.println("Number of Purple Rocks = "+ purple);
}
}