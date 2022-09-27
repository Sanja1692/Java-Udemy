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

        switch(i){
            case 0: System.out.print("\tHarry: "); break;
            case 1: System.out.print("\tRon: "); break;
            case 2: System.out.print("\tHermione: "); break;
            default: System.out.print("Shouldnt be called");

        }

            for (int j = 0; j < grades[i].length; j++) {
                System.out.print(grades[i][j] + " ");
            }
            System.out.print("\n");

        }
    }
    
}
