/**
 * Annual Weather object class
 * 
 * @author APCS Team
 * @version Today
 */

public class CityWeatherV1 {
    // private instance variables - three arrays
    private String[] monthV1;
    private double[] temperatureV1;
    private double[] precipitationV1;
    // constructor with paramete
    public CityWeatherV1() {
        
        
    }
    public  CityWeatherV1(String[] month, double[] temperature, double[] precipitation) {
        String[] monthV1 = month;
        double[] temperatureV1 = temperature;
        double[] precipitationV1= precipitation;
    }
    // setters and getters for each private instance variable
   
    
    public void setMonth(String[] month) {
        String[] monthV1 = month;
    }
    public void setTemperature(double[] temperature) {
        double[] temperatureV1 = temperature;
    }
    public void setPrecipation(double[] precipitation) {
        double[] precipitationV1 = precipitation;
    }
    
     public String[] getMonth() {
        return  monthV1;
    }
    public double[] getTemperature() {
        return temperatureV1;
    }
    public double[] getPrecipation() {
        return precipitationV1;
    }
    
    // method to calculate the average of temperature
    public double averageTemperature() {
        double averageTemperature = 0;
        for(int n = 0; n < temperatureV1.length; n++)
        {
            averageTemperature += temperatureV1[n];
        }
        averageTemperature /= 12;
        return averageTemperature;
    }
    // method to calculate total precipitation array
   public double averagePrecipation() {
       double averagePrecipitation = 0;
       for(int n = 0; n < precipitationV1.length; n++)
        {
            averagePrecipitation += precipitationV1[n];
        }
        averagePrecipitation /= 12;
        return averagePrecipitation;
   }
 
        
        

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02


}
