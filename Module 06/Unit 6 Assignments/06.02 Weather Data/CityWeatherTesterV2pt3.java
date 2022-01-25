    /**
 * Annual Weather client class
 * 
 * Evan Wang
 * 2.2 1/25/22
 */
import java.util.Scanner;
public class CityWeatherTesterV2pt3
{
    
   
    
    // method to print results (formatting output will be done in 6.02)
    
        //Output: display table of weather data including average and total
        //System.out.println();
        //System.out.println("           Weather Data");
        //System.out.println("      Location: " + city +", " + state);
        //System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        //System.out.println();
        //System.out.println("***************************************************");
        //for( int index = 0; index < temperature.length; index++)
        //{
          // use printf to format
        //}
        //System.out.println("Average: " + "    Total: ");
        
        
   
    
    public static void main (String [ ] args)
    {
        String[] monthV2;
        double[] temperatureV2;
        double[] precipitationV2;
        double averageV2;
        double averagePrecipitation;
        Scanner in = new Scanner(System.in);  
        
        System.out.println("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        String temperatureScale = in.next();
        
        System.out.println("Choose the precipitation scale (i = inches, c = centimeters): ");
        String precipitationScale = in.next();
        
        String city = "Apalachicola";  //choose a city from the table provided
        String state = "FL";  //choose a city from the table provided
  
        String [] month = {"Jan", "Feb", "March", "April", "May", "June",
        "July", "August", "September", "October", "Novermber", "December" };
        double  temperature[] = {52.7,55.3,60.7,66.8,74.1,80.0,81.9,81.7,79.1,70.2,62.0,55.2};     //complete initialization of temperatures array
        double precipitation[] ={4.9,3.8,5.0,3.0,2.6,4.3,7.3,7.3,7.1,4.2,3.6,3.5};     //complete initialization of precipitation array
        
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in

        CityWeatherV2pt3 info = new CityWeatherV2pt3(month,temperature,precipitation);
        monthV2 = info.getMonth();
        temperatureV2 = info.getTemperature(temperatureScale);
        precipitationV2 = info.getPrecipitation(precipitationScale);
        averageV2 = info.averageTemperature();
        averagePrecipitation = info.averagePrecipation();

        



    String arg1 = "Weather Data";
        System.out.printf("%30s%n", arg1);
    String arg2 = "Location: " + city + ", " + state;
        System.out.printf("%37s%n", arg2);
    String arg3 = "Month:\t" + "Temperature(" + temperatureScale + ")" + 
        "\tprecipitation(" + precipitationScale + ")\t";
        System.out.printf(arg3);
    System.out.println("\n**********************************************************");
    

     for(int n = 0; n < 12; n++)
        {
            System.out.printf("%8s%13s%20s\n", monthV2[n], temperatureV2[n], precipitationV2[n]);

        }
    System.out.println("\n**********************************************************");
    String refinedHeight = Double.toString(averagePrecipitation) + " inches";
    if(precipitationScale.equalsIgnoreCase("c")) {
        refinedHeight = Double.toString(averagePrecipitation) + " cms";
    }
System.out.printf("AverageTemp: %-15s InchHeight: %-7s", averageV2, refinedHeight);
              
        //conditions & method call to convert temp, if needed - to be completed in 6.02

        //conditions & method call to convert prec, if needed - to be completed in 6.02
        
        //method call to calculate the average temperature
        
        //method call to calculate the total precipitation
        
        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)

        // still dont get why this is printing null

    


    }//end main
}//end class

