public class WhileLoops {
    public static void main(String[] args) {
        for (int i = 25; i <= 30; i++) {
            System.out.println(i);
    }
    // while (numb <= 30) {
    //     System.out.println(numb);
    //     numb++;
    // } // the same as with for
        double choice=0.01;
        double guess = 0.99;
        while(guess >choice){
            guess = Math.random();
            System.out.println(guess);
        }  //???
    }
}
