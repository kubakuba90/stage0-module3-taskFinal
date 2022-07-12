package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double celcius = temperatureCelsius;
        double fahrenheit =((celcius*9)/5)+32;
        System.out.println(fahrenheit);
    }
}
