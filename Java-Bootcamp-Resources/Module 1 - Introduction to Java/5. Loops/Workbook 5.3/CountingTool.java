import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Hi Timmy! Choose a number to count to: ");
        Integer number = scan.nextInt();
        /*Task 1 – Choose a number

            Ask: Hi Timmy! Choose a number to count to: 

            Make sure Timmy can enter the value BESIDE the question. 
        */
        for (int i = 0; i <= number; i++) {
            System.out.print(i +" ");}
        /* Task 2 – Count from 0 to that number

             Let's say Timmy entered 5, you would display: 0 1 2 3 4 5 

        */
System.out.println("\nAnd now");
        for (int i=10; i>number; i--) {
            System.out.println(i + " ");
        }
        for (int i=2; i<10; i+=2) {  //The loop starts at i = 2, and keeps running as long as ' i ' is less than 10.
            System.out.println(i + " ");
        }
        for (int i=10; i>=2; i-=2) {
            System.out.println(i + " ");
        }


        scan.close();
    }
}
