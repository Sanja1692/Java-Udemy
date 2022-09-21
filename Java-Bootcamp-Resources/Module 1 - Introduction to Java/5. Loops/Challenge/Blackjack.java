import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        //Task 3 – Wait for the user to press enter.
        scan.nextLine();
        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>
        int yourFirstCard = drawRandomCard();
        int yourSecondCard = drawRandomCard();
        System.out.println("\n You get a \n" + cardString(yourFirstCard) + "\n and a \n" + cardString(yourSecondCard));
        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>
        int yourHand = Math.min(yourFirstCard, 10) + Math.min(yourSecondCard, 10); //return minimum number not bigger than 10
        System.out.println("Your total is: " + yourHand);

        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden
        int dealerFirstCard = drawRandomCard();
        int dealerSecondCard = drawRandomCard();
        System.out.println("The dealer shows \n" + cardString(dealerFirstCard) + "\nand has a card facing down \n" +faceDown() );
        int dealerHand = Math.min(dealerFirstCard, 10) + Math.min(dealerSecondCard, 10);
        System.out.println("\nThe dealer's total is hidden");
       
        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 
        while(true){
            String player = hitOrStay();
            if(player.equals("stay")){
                System.out.println("The dealer shows \n" + cardString(dealerFirstCard) + "\nand \n" +cardString(dealerSecondCard) );
                System.out.println("The dealer total is " + dealerHand);
                break;}
            int yourNextCard = drawRandomCard();
            yourHand = yourHand + Math.min(yourNextCard, 10);
        System.out.println("\nYou get a \n " + cardString(yourNextCard));
        System.out.println("\nYour new total is " + yourHand);
        if(yourHand>21){
                System.out.println("\nYou lose \n");
                System.exit(0);
        }
        }
        while(dealerHand< 17){
                        int dealerNextCard = drawRandomCard();
                        dealerHand+= Math.min(dealerNextCard,10);
                        System.out.println("\n Dealer gets a \n" + cardString(dealerNextCard));
                        System.out.println("Dealer's total is " + dealerHand);
        }   
        
        if(yourHand>dealerHand){
                System.out.println("\nYou win! \n");
        }else if(dealerHand>21) {
                System.out.println("\nYou win! \n");
        }else{
                System.out.println("\nYou lose \n");
                System.exit(0);
        }
        //For tasks 9 to 13, see the article: Blackjack Part II. 
// First, it's the player's turn. The player can decide to hit or stay.
// hit: draw another card.
// stay: do nothing.
// If the player decides to hit, and their hand value exceeds 21, they go bust (lose).
// Once the player decides to stay, the dealer reveals the hidden card.
// Then, the dealer must hit until their total gets to 17. At 17 points or higher, the dealer's turn ends.
// You win if your hand value is higher than the dealer's hand.
// You win if the dealer goes bust (exceeds 21)
// You lose if the dealer's hand value is higher than yours.
        
scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard(){
        double cardNumber = Math.random()*13;
        cardNumber += 1;
        return (int)cardNumber;
    }
    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
        public static String cardString(int cardNumber){
        switch (cardNumber) {   
            case 1:   
            return "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
            case 2:
            return  "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                  
            case 3:
            return"   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";

            case 4:
            return "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";

            case 5:
            return  "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";

            case 6:
            return  "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";

            case 7:
            return  
                    "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
          

            case 8:
            return  "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
            case 9:
            return  "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";

            case 10:
            return  "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
            case 11:
            return  "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
            case 12:
            return  "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
            case 13:
            return  "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
            default: 
            return "This shouldn't get called.";
                }
        }


    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    
    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    public static String hitOrStay(){
        
       System.out.println("Would you like to 'hit' or 'stay'?");
       String answer = scan.next();
       while(!(answer.equals("hit") || answer.equals("stay"))){
              System.out.println("Please write 'hit' or 'stay'");
              answer = scan.next();}
        return answer;
       }
    }
    

