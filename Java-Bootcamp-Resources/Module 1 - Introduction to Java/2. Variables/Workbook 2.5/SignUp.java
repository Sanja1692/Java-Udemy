import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//to use scanener to get values from the user
        System.out.println("Welcome to JavaGram! Let's sign you up.");
        int count = 0;
        //Task 1 - Using Scanner, ask the user questions

        //Ask for their first name.
        System.out.println("What is your first name?");
        String firstName = scan.nextLine();
        count++;
        //Ask for their last name.
        System.out.println("What is your last name?");
        String lastName = scan.nextLine();
        count++;
        //Ask: how old are you?
        System.out.println("How old are you?");
        int age = scan.nextInt();
        count++;
        /* Ask them to make a username. SIDE NOTE:
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */
        scan.nextLine();
        System.out.println("Please enter your username.");
        String username = scan.nextLine();
        count++;
        //Ask what city they live in.
        System.out.println("In what city do you live?"); 
        String city = scan.nextLine();
        count++;
        //Ask what country that's from.
        System.out.println("In what country do you live?");
        String country = scan.nextLine();
        count++;

        //Task 2 - Print their information. 

        System.out.println("Thank you for joining JavaGram!");
        
        //Print their information like so:
        System.out.println("\nHere is the information you have entered.");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Username: " + username);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);

        // Your information:
        //        First Name: Rayan
        //        Last Name: Slim
        //        Age: 27
        //        Username: monotonic_relu
        //        City: Ottawa
        //        Country: Canada
        //

        scan.close();
        //close scanner. It's good practice :D ! 
    }
}
