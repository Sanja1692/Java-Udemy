public class DiceJack {
    public static void main(String[] args) {
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);


    }
    public static int rollDice(){
        double randomNum = Math.random() * 6; // Math.random return value between 0 and less than 1, so we have to multiply it
        randomNum+=1; // to not be 0 and max to be 6 not 5
        return (int)randomNum; //convert from double to int
    }
}
