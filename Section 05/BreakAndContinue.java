public class BreakAndContinue {
    public static void main(String[] args) {
        for ( int i = 0; i < 10; i++ ){
            if(i %2 != 0){ // prints all even numbers, skips odd numbers
                continue;
            }
            System.out.println(i);
        }
        for ( int i = 20; i > 10; i-- ){
            if(i %2 != 0){ // as soon as the number is odd it breaks the loop
                break;//print just 20            }
            System.out.println(i);
        }
    }
    
}
