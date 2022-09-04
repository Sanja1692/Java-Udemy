public class BuildInFunctions {
    public static void main(String[] args) {
        System.out.println("Hello Java");
       // math functions: log, sin, cos 
    // Math.log(119.6);
    // }
    // public double log(double a) {
    // }
    double sine = Math.sin(1.2);
    System.out.println("The sin of 1.2 is: " + sine);
    double power = Math.pow(2,4);
    System.out.println("2 to the power of 4 is: " + power);
    double random = Math.random(); // random number generator - between 0 and 1
    System.out.println("The random number is: " + random);
    double random1 = Math.random() * 100; // random numb - between 0 and 100
    System.out.println("The random number between 0 and 100 is: " + random1);
}
}