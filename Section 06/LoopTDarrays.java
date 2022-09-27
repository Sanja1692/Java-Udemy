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
        //////
        int[][] table = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
       }; 
               
        // for (int j = 0; j < table.length; j++) {
        //     System.out.print(table[0][j]);  // 123
        //     System.out.print(table[1][j]); // 456
        //     System.out.print("\n");

        // }
        // for (int i = 0; i < table.length; i++) {
        //     System.out.print(table[i][0]);  // 147
        //     System.out.print(table[i][1]); // 258
        //     System.out.print("\n");

        // }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j]); //////// 123456789
            System.out.print("\t");

                System.out.print(table[j][i]); /////// 147258369
            System.out.print("\t");

                System.out.print(table[i][i]);//////111555999
                System.out.print(table[j][j]);//////159159159


            }
        }
        //////////////77



    }
    
}
