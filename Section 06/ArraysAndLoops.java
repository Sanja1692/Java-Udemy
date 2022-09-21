public class ArraysAndLoops {
    public static void main(String[] args) {
    String[] kingdoms = {"Mercia", "Wessex", "Northumbria", "E A"};
    System.out.println("The number of elements is " + kingdoms.length);
        for (int i = 0; i < kingdoms.length; i++) { // the sam as i < 4; - dont have to count elements youer self
            System.out.println("The element at index " + i+ " is " + kingdoms[i]);
    }

    // char[] array = { 'q', 'u', 'i', 'z', '6', '2'};
        
    //     boolean bool = array[array.length - 2] == array[3];  //false
    char[] array = { 'q', 'u', 'i', 'z', '6', '2'};
        
    System.out.println ( array[array.length-1] ); //2 - This is a very popular way of getting the last index in an array!


    // char[] array2 = { 'q', 'u', 'i', 'z', '6', '2'};
        
        // for (int i = 0; i <= array2.length; i++) {//Durring the last run, counter i will equal the array's length (6), which is out of bounds.

        //     System.out.println(array2[i]);
        // }
        // char[] array3 = { 'q', 'u', 'i', 'z', '6', '2'};
        
        // for (int i = array3.length; i >= 0 ; i--) {//During the first run, i is equal to 6 which is out of bounds.

        //     System.out.println(array3[i]);
        // }
        char[] array4 = { 'q', 'u', 'i', 'z', '6', '2'};
        
        for (int i = array4.length - 1; i >= 0 ; i--) {//This loop runs backwards. i starts at index 5, and keeps decreasing until it equals index 0.

            System.out.println(array4[i]);
        }
}
}
