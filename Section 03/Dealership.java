import java.util.Scanner;
public class Dealership {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Java Dealership.");

        System.out.println(" - Select option 'a' to buy a card.");
        System.out.println(" - Select option 'b' to sell a card.");

        String option = scanner.nextLine();
        switch (option) {
            case "a": System.out.println("What is your budget?");
            int budget = scanner.nextInt();
            if (budget >= 10000){
                System.out.println("Great! A nissan Altima is available.");
                System.out.println("\nDo you have insurance? Write 'yes' or 'no'");
            }else{
                System.out.println("We don't sell cars under $10000. Sorry!");
            }break;

            case "b": System.out.println("you chose option " + option);break;
            default: System.out.println("Invalid option");
scanner.close();
    }
}
}