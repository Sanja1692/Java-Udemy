import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        /* Task 1 
            1. Pick up a username and password from the user.
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("• Username: ");
        String uName = scan.nextLine();
        //pick up username
        System.out.print("• Password: ");
        String uPassword = scan.nextLine();
        //pick up password

        while(username != uName && password != uPassword){
        System.out.print("\nIncorrect, please try again!\n");
        System.out.print("• Username: ");
        uName = scan.nextLine();
        System.out.print("• Password: ");
        uPassword = scan.nextLine();

        }
        /* Task 2 
            1. Set up a loop that keeps running while the username OR password is incorrect. 
               When they get it wrong:
                •  println: \nIncorrect, please try again!\n
                •  get them to enter their username and password again
            2. After they enter the correct information, print: 
                   \nSign in successful. Welcome!
       */
        System.out.println("\nSign in successful. Welcome!");
        scan.close();

        
    }
}
