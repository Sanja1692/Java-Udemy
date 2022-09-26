public class LoopTDarrays {
    public static void main(String[] args) {
        int [][] grades = {
            {72,74,78,76},
            {62,64,69,68},
            {92,99,96,100}
        };
        //Loop for every row - not a good idea
        // for (int j = 0; j < grades[0].length; j++) {
        //     System.out.print(grades[0][j] + " ");
        // }
        // System.out.print("\n");
        // for (int j = 0; j < grades[1].length; j++) {
        //     System.out.print(grades[1][j] + " ");
        // }
        // System.out.print("\n");

        // for (int j = 0; j < grades[2].length; j++) {
        //     System.out.print(grades[2][j] + " ");
        // }
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[0][j] + " ");

            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[0][j] + " ");
            }
        }
    }
    
}
