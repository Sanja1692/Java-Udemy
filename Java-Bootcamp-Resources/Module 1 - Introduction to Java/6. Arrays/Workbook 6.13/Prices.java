public class Prices {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
        // double[][] values = new double[3][5];
        // Task 2 - Populate your 2D array with values from the table (see article)
        double[][] values = {{12.99, 8.99, 9.99, 10.49, 11.99},
        {0.99, 1.99, 2.49, 1.49, 2.99},
        {8.99, 7.99, 9.49, 9.99, 10.99}
        };
        // Task 3 - Print the prices for each department. See the article for the expected output.  
        for (int i = 0; i < values.length; i++) {
            switch (i) {
                case 0: System.out.print("\nBaking:");break;
                case 1: System.out.print("\nBeverage:");break;
                case 2: System.out.print("\nCereals:");break;
                default: System.out.print("Nothing:");
            }
            for (int j = 0; j < values.length; j++) {
                System.out.print(values[i][j] + " ");
            }
            }

    }
}