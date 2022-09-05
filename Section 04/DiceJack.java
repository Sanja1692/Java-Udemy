import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

       System.out.println("Enter 3 numbers between 1 and 6.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 < 1 || num2 < 1 || num3 < 1){
       System.out.println("Numbers cannot be less than 1. Shutting the game down.   ");
       System.exit(0);}
       if (num1 > 6 || num2 > 6 || num3 > 6){
        System.out.println("Numbers cannot be greater than 6.Shutting the game down.   ");
        System.exit(0);
        }

        int sumOfNum = num1+num2+num3;
        int sumDiceRolls = roll1+roll2+roll3;
        System.out.println("Dice sum = " + sumDiceRolls +" . Numbers sum = " + sumOfNum);

        checkWin(sumOfNum, sumDiceRolls);

        scan.close();
    }
    public static int rollDice(){
        double randomNum = Math.random() * 6; // Math.random return value between 0 and less than 1, so we have to multiply it
        randomNum+=1; // to not be 0 and max to be 6 not 5
        return (int)randomNum; //convert from double to int
    }
    public static void checkWin(int sumOfNum, int sumDiceRolls){
        if (sumOfNum > sumDiceRolls && (sumOfNum - sumDiceRolls) < 3){
            System.out.println("Congratulations, you win!");
        }else{
            System.out.println("Sorry, you lose.");
        }

    }
}
