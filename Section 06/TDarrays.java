import java.sql.Array;
import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        // int [][] grades = new int[3][4];         //1.bracet number of rows, 2.bracet number of columns

        // grades[0][0] = 72;
        // grades[0][1] = 74;
        // grades[0][2] = 78;
        // grades[0][3] = 76;

        // grades[1][0] = 62;
        // grades[1][1] = 64;
        // grades[1][2] = 69;
        // grades[1][3] = 68;

        // grades[2][0] = 92;
        // grades[2][1] = 99;
        // grades[2][2] = 96;
        // grades[2][3] = 100;

        // OR SIMPLE

        int [][] grades = {
            {72,74,78,76},
            {62,64,69,68},
            {92,99,96,100}
        };

        // System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        // System.out.println("\tRon: " + Arrays.toString(grades[1]));
        // System.out.println("\tHermione: " + Arrays.toString(grades[2]));
        
        //to excess every value separatly 

        System.out.println("\tHarry: " + grades[0][0] + " " + grades[0][1] + " " + grades[0][2] + " " + grades[0][3] + " ");
        System.out.println("\tRon: " + grades[1][0] + " " + grades[1][1] + " " +grades[1][2] + " " + grades[1][3] + " ");
        System.out.println("\tHermione: " + grades[2][0] + " " + grades[2][1] + " " + grades[2][2] + " " + grades[2][3] + " ");

        ////
        String[][] table3 = new String[3][3]; 
        System.out.println((table3[0])); // reference
        ////
        String[][] table4 = new String[3][3]; 
        System.out.println((Arrays.toString(table4[0])));// null null null
        /////
        String[][] table6 = new String[3][2]; 
 
        System.out.println(table6.length); ///3
        System.out.println(table6[0].length);//2
        System.out.println(table6[1].length);//2
        //
        String[][] table7 = new String[3][2]; 
        System.out.println(Arrays.toString(table7[3]));// index out of bounds

        ///
        String[][] table8 = new String[3][2]; //Each row only has 2 elements. An index of 2 implies there are three.

        System.out.println(table8[2][0]);//null
        System.out.println(table8[2][2]);//index out of bounds
        ///
        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6}
        }; 
 
        numbers[1][1] = 7; ///{1, 2, 3},
                     //      {4, 7, 6}
        ///7
        int[][] numbers2 = {
            {1, 2, 3},
            {4, 5, 6}
       }; 
        
       numbers2[10%2][5%2] = 7;///{1, 7, 3},
                            //      {4, 7, 6}

    }
    
}
