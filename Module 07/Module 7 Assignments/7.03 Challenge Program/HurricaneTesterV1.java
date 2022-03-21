/**
 * Starter code for the Hurricane Tester
 * APCS Team 2020
 *
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.*;

public class HurricaneTesterV1

{

    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
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
            windSpeeds[i] = 0;
            namesV2[i] = "0";
        } else {
            continue;
        }
    }
    
    //Filter
    years = Arrays.stream(years).filter(x -> x != 0).toArray();
    pressures = Arrays.stream(pressures).filter(x -> x!=0).toArray();
    windSpeeds = Arrays.stream(windSpeeds).filter(x -> x!=0).toArray();
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
        int presAlpha =0;
        int catAlpha =0;
        int catMin = 10000;
        int presMin =10000;
        int windMin =10000;
        int catMax = 0;
        int presMax=0;
        int windMax =0;
        for (int i = 0; i < years.length; i++) {
            presAlpha += pressures[i];
            catAlpha += category[i];
            if(category[i] < catMin) {
                catMin = category[i];
            }
            if(category[i] > catMax){
                catMax = category[i];
            }
            if(pressures[i] < presMin){
                presMin = category[i];
            }
            if(category[i] > presMax) {
                presMax = pressures[i];
            }
            if(windSpeeds[i] < windMin) {
                windMin = category[i];
            }
            if(windSpeeds[i] > windMax){
                windMax = category[i];
            }
        }
        //create a Hurricane ArrayList using the data above
        ArrayList<Hurricane> hurricane = new ArrayList<Hurricane>(); 
        for (int i = 1; i < years.length; i++) {
        hurricane.add(new Hurricane(years[i], names[i], months[i],  category[i], pressures[i], windSpeeds[i]));
    }
    
        Hurricane dataRecord;
        for (Hurricane dataRecordV1 : hurricane) {
            dataRecord = dataRecordV1;
            dataRecord.getYear();
            dataRecord.getName();
            dataRecord.getMonth();
            dataRecord.getCat() ;
            dataRecord.getPressure();
            dataRecord.getWindspeed();
        }
        //user prompted for range of years
        
        
        //print the data
        System.out.println("Graph: \tYear\tHurricane\tCategory\tPressure (mb)\t Wind Speed (mph)");
        System.out.println(hurricane.size());
        for(int i = 0; i < hurricane.size(); i ++)
        {
            System.out.println("\t" + hurricane.get(i));
            
            // print each CheeseCake's data
        }
    int windAverage = averageSpeeds / years.length;
    int catAverage = catAlpha / years.length;
    int presAverage = presAlpha / years.length;
    System.out.println("Category Stats (average, min, max): " + catAverage + "\t" + catMin + "\t" + catMax);
    System.out.println("Wind Speed Stats (average, min, max): " + windAverage + "\t" + windMin + "\t" + windMax);
    System.out.println("Pressure Stats (average, min, max): " + presAverage + "\t" + presMin + "\t" + presMax);
    System.out.println("Summarry of the Categories: ");
    System.out.println("\tCategory 1:" + cat1 );
    System.out.println("\tCategory 2:" + cat2);
    System.out.println("\tCategory 3:" + cat3);
    System.out.println("\tCategory 4:" + cat4);
    System.out.println("\tCategory 5:" + cat5);
     }
}