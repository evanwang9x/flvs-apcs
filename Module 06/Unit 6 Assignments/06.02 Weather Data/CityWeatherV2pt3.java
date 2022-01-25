/**
 * Annual Weather object class
 * 
 *Evan Wang
 *2.1 1/25/22
 */

public class CityWeatherV2pt3 {
    // private instance variables - three arrays
    private String[] monthV2;
    private double[] temperatureV2;
    private double[] precipitationV2;
    private double[] temperatureCelsius;
    private double[] precipitationInches;
    // constructor with paramete

    public CityWeatherV2pt3(String[] month, double[] temperature, double[] precipitation) {
        monthV2 = month;
        temperatureV2 = temperature;
        precipitationV2= precipitation;
    }
    // setters and getters for each private instance variable
   
    
    public void setMonth(String[] month) {
         monthV2 = month;
    }
    public void setTemperature(double[] temperature) {
        temperatureV2 = temperature;
    }
    public void setPrecipitation(double[] precipitation) {
        precipitationV2 = precipitation;
    }
    
     public String[] getMonth() {
         return  monthV2;
    }
    public double[] getTemperature(String temperatureScale) {
        if(temperatureScale.equalsIgnoreCase("C")) {
        for (int n = 0; n <12; n++)
        temperatureV2[n]= Math.round(((temperatureV2[n] - 32) * 5 / 9) * 100.0) / 100.0;
    
   }
        return temperatureV2;
    }
    public double[] getPrecipitation(String precipitationScale) {
        if(precipitationScale.equalsIgnoreCase("C")) {
        for (int n = 0; n <12; n++)
        precipitationV2[n]= Math.round((precipitationV2[n] * 2.54)) * 100.0 / 100.0;
    }
        return precipitationV2;
    }
    
    // method to calculate the average of temperature
    public double averageTemperature() {
        double averageTemperatureV2 = 0;
        for(int n = 0; n < temperatureV2.length; n++)
        {
            averageTemperatureV2 += temperatureV2[n];

        }
        double averageTemperature= Math.round(averageTemperatureV2 /= 12) / 100.0 * 100.0;
        return averageTemperature;
    }
    // method to calculate total precipitation array
   public double averagePrecipation() {
       
       double averagePrecipitationV2 = 0;
       for(int n = 0; n < precipitationV2.length; n++)
        {
            averagePrecipitationV2 += precipitationV2[n];

        }
       double averagePrecipitation =  Math.round(averagePrecipitationV2  * 100.0) / 100.0;
        return averagePrecipitation;
   }
   public double[] convertToCelsius(String temperatureScale) {
       if(temperatureScale.equalsIgnoreCase("C")) {
        for (int n = 0; n <12; n++)
        temperatureV2[n]= Math.round(((temperatureV2[n] - 32) * 5 / 9) * 100.0) / 100.0;
    
   }
   return temperatureV2;
    }
    public double[] convertToCms(String precipitationScale) {
        if(precipitationScale.equalsIgnoreCase("C")) {
        for (int n = 0; n <12; n++)
        precipitationV2[n]= Math.round((precipitationV2[n] * 2.54)) * 100.0 / 100.0;
    }
    return precipitationV2;
    }
        
        

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02


}
