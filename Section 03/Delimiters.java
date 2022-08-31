import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter two integers (on the same line)");
        // int num1 = scan.nextInt();
        // int num2 = scan.nextInt();

        // System.out.println("Enter two very big integers (on the same line)");
        // long bigNum1 = scan.nextLong();
        // long bigNum2 = scan.nextLong();

        // System.out.println("Enter two decimals(on the same line)");
        // double decimal1 = scan.nextDouble();
        // double decimal2 = scan.nextDouble();

        // System.out.println("Enter two text values (on the same line)");
        // String word1 = scan.next();
        // String word2 = scan.next();

        // scan.close();
        // System.out.println("\tIntegers:"+num1+" " +num2);
        // System.out.println("\tBig integers:"+bigNum1+" " +bigNum2);
        // System.out.println("\tDecimals:"+decimal1+" " +decimal2);
        // System.out.println("\tWords:"+word1+" " +word2);

        //OR
        System.out.println("Enter two integers (on the same line)");
        String num = scan.nextLine();
       

        System.out.println("Enter two very big integers (on the same line)");
        String bigNum = scan.nextLine();

        System.out.println("Enter two decimals(on the same line)");
        String decimal = scan.nextLine();

        System.out.println("Enter two text values (on the same line)");
        String word = scan.nextLine();

        scan.close();
        System.out.println("\tIntegers:"+num);
        System.out.println("\tBig integers:"+bigNum);
        System.out.println("\tDecimals:"+decimal);
        System.out.println("\tWords:"+word);
        //nextLine - is skiped when is after another scan.next... because it continues in the same line to read values, that is why we use it than 2 times next.line or just one time scan.next()
     
        //What is the value of each variable?


        // String line1 = scan.nextLine();
        // String line2 = scan.nextLine();
        // String line3 = scan.nextLine();
        // String line4 = scan.nextLine();
        // String line5 = scan.nextLine();
        // >>: 25                                  

        // >>: 54                                  
        
        // >>:      78.3      44.3       25        
        
        // >>:      55.4                           
        
        // >>: 33.2  

        // line1: 25
        // line2: 54
        // line3:     78.3      44.3      25
        // line4:     55.4
        // line5: 33.2 
    }
}
