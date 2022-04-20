
/**
 * Write a description of class fdsa here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fdsa
{
    public static int recur(int n)
{
     if(n < 1)
     {
          return 3;
     }
     else
     {
          return recur(n / 5) + 2;
     }
}
public static void main(String [] args) {
    int recurV2 = recur(21);
    System.out.println(recurV2);
}
}
