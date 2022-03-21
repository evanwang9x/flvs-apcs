
/**
 * Write a description of class sdaff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class sdaff
{
    
    public static void main (String [] args) {
    int [] array =  new int[] {5, 6, 7, 8, 9, 10, 11, 12};
    int[] copy  = new  int[array.length];
    for (int i = 0; i < array.length; i++) {
    if (array[i] > 8) {
        copy[i] = array[i];
    } else {
        continue;
    }
}
copy = Arrays.stream(copy).filter(d -> d != 0.0).toArray();
for (int i =0; i < copy.length; i++) {
    System.out.println(copy[i]);
}
    }
}
