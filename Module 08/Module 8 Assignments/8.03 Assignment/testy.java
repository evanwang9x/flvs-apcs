
/**
 * Write a description of class testy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testy
{
    public static void main (String [] args) {
        
     String[] list = {"Hello Boomer", "Sup Sup", "Poo Poo"};
        for(int i = 0; i< list.length; i++) {
        int subNumber = list[i].indexOf(" ");        
        
        System.out.println(list[i].substring(0,subNumber-1));
    }
    }
}
