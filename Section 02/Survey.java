import java.util.Scanner;
// Question: Why does my code crash when nextDouble picks up a decimal with a dot . ?
// Your Scanner's locale is French, which uses , for decimals. Tell Scanner to use an English locale.

// import java.util.Locale;
 
// Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);  
// As you autocompleteLocale, make sure it gets imported (see line 1).

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//to use scanener to get values from the user
        System.out.println("Welcome. Thank you for taking the survey!");
        int counter = 0;
        System.out.println("\nWhat is your name?");
        String name = scan.nextLine();//it waits for the user to enter a string - in terminal
        //to be able to use this value we have to store it inside a variable
        counter++;
        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scan.nextDouble();//waits for the user to enter a decimal
        counter++;
        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scan.nextDouble();
        counter++;
        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scan.nextInt();
        //waits for the user to enter an integer
        counter++;
        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scan.nextInt();
        counter++;
        System.out.println("\nThank you " + name + " for answering all " + counter + " questions.");
        System.out.println("\nYour fast food expenses are " +(foodPrice/coffeePrice) + " times your coffee expenses.");
        System.out.println("\nWeekly, you spend $" + (coffeePrice*coffeeAmount) + " on coffee.");
        System.out.println("\nWeekly, you spend $" + (foodPrice*foodAmount) + " on fast food.");

        scan.close();
    }
}