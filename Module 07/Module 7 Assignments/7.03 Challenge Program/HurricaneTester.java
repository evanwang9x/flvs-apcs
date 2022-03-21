/**
 * To help you test how powerful this Hurricane is
 * Evan Wang  
 * 2/25/2022 V1.0
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class HurricaneTester

{

    public static void main(String[] args) throws IOException
    {
            File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        Scanner poop;
        poop = new Scanner(System.in);
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] monthsV2 = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];

        String [] namesV2 = new String[numValues];
        int [] category = new int[numValues];

        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            monthsV2[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble() * 1.151;
            namesV2[index] = inFile.next();
            index++;
        }
        inFile.close();
        
        //convert the windspeed, determine categories, calculate sums
        int averageSpeeds =0;

   
        int yearMinRange;
        int yearMaxRange;
    System.out.println("Add in the lowest year to include (inclusive): ");
    yearMinRange = poop.nextInt();
    System.out.println("Add in the highest year to include (inclusive): ");
    yearMaxRange = poop.nextInt();
    for (int i = 0; i < years.length; i++) {
        if(years[i] < yearMinRange || years[i] > yearMaxRange) {
            years[i] = 0;
            monthsV2[i] = "0";
            pressures[i] = 0;
            windSpeeds[i] = 0.0;
            namesV2[i] = "0";
        } else {
            continue;
        }
    }
    
    //Filter
    years = Arrays.stream(years).filter(x -> x != 0).toArray();
    pressures = Arrays.stream(pressures).filter(x -> x!=0).toArray();
    windSpeeds = Arrays.stream(windSpeeds).filter(x -> x!=0.0).toArray();
    String [] copyMonths = new String[numValues];
    for (int i = 0; i < monthsV2.length; i++) {
        if(monthsV2[i] != "0") {
            copyMonths[i] = monthsV2[i];
        } else {
            continue;
        }
    }
    String[] months = Arrays.stream(copyMonths).filter(Objects::nonNull).toArray(String[]::new);
    String[] copyNames = new String[numValues];
    for (int i = 0; i < namesV2.length; i++) {
        if(namesV2[i] != "0") {
            copyNames[i] = namesV2[i];
        } else {
            continue;
        }
    }
    String[] names = Arrays.stream(copyNames).filter(Objects::nonNull).toArray(String[]::new);
    
        int cat1 =0;
        int cat2 =0;
        int cat3 =0;
        int cat4 =0;
        int cat5 =0;
        for (int indexV2 = 0; indexV2 < windSpeeds.length; indexV2++ )
        {
            averageSpeeds += windSpeeds[indexV2];
            if (windSpeeds[indexV2] >= 74 && windSpeeds[indexV2] <= 95) {
                category[indexV2] = 1;
                cat1++;
            } else if (windSpeeds[indexV2] >= 96 && windSpeeds[indexV2] <= 110) {
                category[indexV2] = 2;
                cat2++;
            } else if (windSpeeds[indexV2] >= 111 && windSpeeds[indexV2] <= 129) {
                category[indexV2] = 3;
                cat3++;
            } else if (windSpeeds[indexV2] >= 130 && windSpeeds[indexV2] <= 156) {
                category[indexV2] = 4;
                cat4++;
            } else {
                category[indexV2] = 5;
                cat5++;
            }
        }     
        System.out.println(windSpeeds[0]);
        System.out.println(category[0]);
        System.out.println(cat1);
     }
}