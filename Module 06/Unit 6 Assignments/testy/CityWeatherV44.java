/**
 * Annual Weather object class
 * 
 * @author APCS Team
 * @version Today
 */

public class CityWeatherV44 {
    private String[] monthV2;
    private double[] temperatureV2;;
    private double[] precipitationV2;
    // private instance variables - three arrays
    public CityWeatherV44() {
        
    }
    public CityWeatherV44(String[] month, double[] temperature, double[] precipitation) {
        String[] monthV2 = month;
        double[] temperatureV2 = temperature;
        double[] precipitationV2 = precipitation;
    }
    public void setMonth(String[] month) {
        String[] monthV2 = month;
    }
    public void setTemperature(double[] temperature) {
        double[] temperatureV2=  temperature;
    }
    public void setPrecipitation(double[] precipitation) {
        double[] precipitationV2 = precipitation;
    }
         public String[] getMonth() {
        return  monthV2;
    }
    public double[] getTemperature() {
        return temperatureV2;
    }
    public double[] getPrecipitation() {
        return precipitationV2;
    }
    
    // constructor with parameters

    // setters and getters for each private instance variable

    // method to calculate the average of temperature
      
    // method to calculate total precipitation array
   
 
        
        

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02


}
