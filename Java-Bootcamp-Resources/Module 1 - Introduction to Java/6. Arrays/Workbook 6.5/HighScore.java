public class HighScore {
    public static void main(String[] args) {
        int[] randNumbers = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        /** Task 2 
         *
         *    1. Create an array that stores 10 random numbers
         *    2. Using a for loop, print the array elements on the same line.
         *         Example – Here are the scores: 14775 48328 7928 27102 21787 21063 38096 42711 32863 23707
         */
        int highScore = 0;

         /** Task 3
          *  
          *   1. Using a for loop, find the highest score in the array and update the highScore.
          *   2. println("\n\nThe highest score is: <>. Give that man a cookie!");

          */
          
        System.out.println("\n\nHere are the scores: ");

        for (int i = 0; i < randNumbers.length; i++) {
        System.out.print(randNumbers[i]+ " ");
        }
        for (int i = 0; i < randNumbers.length; i++) {
        if(randNumbers[i] > highScore) {//MAX VALUE!!!
            highScore = randNumbers[i];    
        }
        }System.out.println("\n\nThe highest score is: "+highScore+". Give that man a cookie!");
    }
    /** Task 1
     * Function name – randomNumber
     * @return random number (int)
     * 
     * Inside the function
     *  - returns a random number between 0 and 50000
     */
    public static int randomNumber(){
        double random = Math.random()*50000;
        random++;
        int randInt = (int)random;
        return randInt;
    }

}
