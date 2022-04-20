
/**
 * Write a description of class fd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class fd
{
public static String recur(String str, int n)
{
     if(n >= str.length())
     {
          return str;
     }

     return str + recur(str.substring(n + 1), n);
}
public static int mystery(int n)
{
     if (n >= 3)
     {
          return mystery(n - 1) + 2;
     }

     return n + 1;
}
public static void recur(String str)
{
     int len = str.length();
     if(len > 1)
     {
          String temp = str.substring(0, len - 2);
          recur(temp);
          System.out.println(temp);
     }
}
    public static void main (String [] args) {
        String finalResult = recur("mouse", 1);
        System.out.println(finalResult);
        int mytery = mystery(5);
        System.out.println(mytery);
        
        String hello = "Computer";
        System.out.println(hello.length());
        recur("Computer");
   
    }
}