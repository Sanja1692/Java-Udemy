import java.lang.reflect.Array;
import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {
        
        double[] celcius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        //Task 2, call celsiusToFahrenheit and store the result in the fahrenheit array. 
        double[] fahrenheit = celciusToFahrenheit(celcius);

        //Task 4, Call printTemperatures for celcius and fahrenheit.
        // printTemperatures(celcius,)
        // printTemperatures
        printTemperatures(celcius, "Celsius");
        printTemperatures(fahrenheit, "Fahrenheit");
    }


    /** Task 1
     * Function name: celciusToFahrenheit. 
     * @param celcius ( double[] )
     * @return fahrenheit ( double[] )
     * 
     * Inside the function: 
     *    1. Create an array 'fahrenheit' with the same length as 'celcius'.
     *    2. Copy all the values from celcius into the fahrenheit array.
     *    3. Update all the values in the array according to: F = (C/5 * 9) + 32.
     *    4. return the fahrenheit array.
     */   
    public static double[] celciusToFahrenheit(double[] celcius) {
        double[] fahrenheit = new double[celcius.length];
        for (int i = 0; i < celcius.length; i++) {
            fahrenheit[i] = (celcius[i]/5 *9)+32;
        }        
        return fahrenheit;
    }
    /** Task 3
     * Function name - printTemperatures
     * @param temp ( double[] )
     * @param type ( String ) can be either celcius or Fahrenheit
     * 
     * Inside the function:
     *   1. Uses a for loop to print the temperature values on the SAME line.
     *       Example:  celcius: [celcius values separated by a space]
     *   2. Adds a new line of space after printing the contents of the array.
     *   3. (Task 5) Rounds every temperature value to two decimal places. 
     */
    ///??????????///??????????///??????????///??????????///??????????
    public static void printTemperatures(double[] temp, String type) {
        System.out.print(type +": ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(String.format("%.2f", temp[i]) +" ");  ///??????????
        }
        System.out.print("\n");

    }

}
