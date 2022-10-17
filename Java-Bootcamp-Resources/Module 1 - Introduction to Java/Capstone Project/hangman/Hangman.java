import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {
    "+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        int misses = 0;
        String word = randomWord();
        char[] placeholders = new char[word.length()];
        // int countLetters = 0;
        // for(int i = 0; i < word.length(); i++) {
        //     if(word.charAt(i) != ' ')  // how many characters does the word contain
        //         countLetters++;
        //     }
        // System.out.println('_'*countLetters);

        while(misses < 6){
        System.out.println("Guess :"+ guess); 
        String guessLetter = scan.nextLine();
        guess++;
            System.out.print("\n");
            
        System.out.println("Guess :" + guess);
        if(word.contains(guessLetter)){
            System.out.println("Correct");
        }else{
            misses++;
            System.out.println("Incorrect");
        }
        System.out.println("Word:" + guessLetter);
        System.out.println("Misses:"+misses);
        if(misses==6){
            System.out.println("You loses!");
            System.out.println("\nThe word was: '" + word + "'");
            System.exit(0);
        }
            // if (guessLetter.equals(words[i])) {
            //     }

        System.out.println("GOOD JOB!");
            }
            
        
    }
    public static String randomWord() {
        int numWords = words.length;
        double randomDouble = Math.random();
        int randomW = (int)(randomDouble * numWords);
        return words[randomW];
        }

}





