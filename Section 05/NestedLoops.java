public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i <3; i++) { // 3passes*3inner loop=9 print statment
        System.out.println("Run: " + i);
            for (int j = 0; j < 3; j++) {   
            System.out.println(j +" Hello");
        }
        }
    }
}