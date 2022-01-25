/**
 * Annual Weather client class
 * 
 * @author APCS Team
 * @version Today
 */
import java.util.Scanner;
public class CityWeatherTesterV1
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

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "";  //choose a city from the table provided
        String state = "";  //choose a city from the table provided
  
        String [] month = {"Jan", "Feb", "March", "April", "May", "June",
        "July", "August", "September", "October", "Novermber", "December" };     //complete initialization of months array
        double [] temperature = {52.7, 55.3, 60.7, 66.8, 74.1, 80.0, 81.9,
        81.7, 79.1, 70.2, 62.0, 55.2};     //complete initialization of temperatures array
        double [] precipitation ={4.9, 3.8, 5.0, 3.0, 2.6,
            4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5};     //complete initialization of precipitation array
    
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
       

        //input to decide F/C and in/cm - to be completed in 6.02
    
    //instantiate AnnualWeatherV1 object
        String[] monthV2;
        double[] temperatureV2;
        double[] precipationV2;
        
        CityWeatherV1 info = new CityWeatherV1();
        monthV2 = info.getMonth();
        temperatureV2 = info.getTemperature();
        precipationV2 = info.getPrecipation();
        
        System.out.println("Months: " + monthV2);
        System.out.println("Average Temperature: " + temperatureV2);
        System.out.println("Average Precipation: " + precipationV2);
        
        //conditions & method call to convert temp, if needed - to be completed in 6.02
        
        //conditions & method call to convert prec, if needed - to be completed in 6.02
        
        //method call to calculate the average temperature
        
        //method call to calculate the total precipitation
        
        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)
    
    
    
    


    }//end main
}//end class

