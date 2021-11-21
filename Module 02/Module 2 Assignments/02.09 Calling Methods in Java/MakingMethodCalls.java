    /**
 * To help with math that involves 5 and 10
 *
 * Evan Wang
 * 11/14/21
 */ 
 public class MakingMethodCalls

{
    public static void addTheseTwo()
    {
        System.out.println("Ten plus five equals " + (10 + 5));
    }   
    
    public static void multiplyTheseTwo(int a, int b)
    {
        System.out.println("Ten times five equals " + (a * b));
    }  
    
    public static int divideTheseTwo(int a, int b)
    {
        return (a / b);
    }    
    
    public static void main(String[] args)
    {
        int x = 10;
        int y = 5;
        
        addTheseTwo();
        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten plus five equals 15"
         */


        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten times five equals 50"
         */
        

        
            int answer = divideTheseTwo(x,y);
        System.out.print("Ten divided by five equals " + answer);
        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten divided by five equals 2"
         */
        
    String a = "Mathematics";
    String b = "Computer Science";
    String c = (a + " and " + b);
    int n = c.length();
    System.out.println(n);

    }//end of main method
}//end of class
