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
                System.out.println("\nDo you have insurance? Write 'yes' or 'no'.");
                scanner.nextLine();
                String insurance = scanner.nextLine();
                System.out.println("\nDo you have license? Write 'yes' or 'no'.");
                String license = scanner.nextLine();
                System.out.println("\nWhat is your credit score?");
                int creditScore = scanner.nextInt();
                if(insurance.equals("yes") && license.equals("yes") && creditScore > 660){
                System.out.println("\nSold! Pleasure doing business with you.");
                }else{
                    System.out.println("\nWe are sorry. You are not eligible.");
            }
            }else{
                System.out.println("\nWe don't sell cars under $10000. Sorry!");
            }break;

            case "b": System.out.println("\nWhat is your car valued at?");
            int value = scanner.nextInt(); 
            System.out.println("\nWhat is your selling price?");
            int price = scanner.nextInt(); 

            if (value > price && value <30000){
                System.out.println("\nWe will buy your car. Pleasure doing business with you!");
            } else {
                System.out.println("\nSorry, we are not interested.");
            }

            break;
            default: System.out.println("\nInvalid option");
scanner.close();
    }
}
}