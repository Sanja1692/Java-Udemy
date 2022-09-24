import java.lang.reflect.Array;
import java.util.Arrays;

public class ReferenceTrap{
    public static void main(String[] args) {
        String[] staffLastYear = {"John", "Jahn", "Tom"};
        /////
        // String[] staffThisYear = staffLastYear;
        // staffThisYear[1] = "Abby";// it effects both arrays! 

        ////SOLUTION - always make a new array than copy elements with a for loop
        String[] staffThisYear = new String[3];
        for(int i=0; i<staffThisYear.length; i++){
            staffThisYear[i] = staffLastYear[i];
        }
        staffThisYear[1] = "Abby"; 
        
    ////BETTER SOLUTION
        String[] staffNextYear = Arrays.copyOf(staffLastYear, staffLastYear.length);
        staffNextYear[2] = "Odin";
   
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
        System.out.println(Arrays.toString(staffNextYear));

        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
        String[] moreItems = items;
 
        moreItems[2] = "sofa";
        System.out.println(Arrays.toString(items)); //"clock", "table", "soffa", "chair", "oven", "phone"
        ///7
        String[] items2 = {"clock", "table", "ladder", "chair", "oven", "phone"};
 
        String[] moreItems2 = new String[items2.length];
        moreItems2[2] = "sofa";
        System.out.println(Arrays.toString(items2)); //"clock", "table", "ladder", "chair", "oven", "phone"
        /////
        String[] items3 = {"clock", "table", "ladder", "chair", "oven", "phone"};
 
        String[] moreItems3 = Arrays.copyOf(items3, items3.length);
        items3[2] = "sofa";
        System.out.println(Arrays.toString(items3)); //"clock", "table", "sofa", "chair", "oven", "phone"
        System.out.println(Arrays.toString(moreItems3)); //"clock", "table", "ladder", "chair", "oven", "phone"
        ////////
        String[] items4 = {"clock", "table", "ladder", "chair", "oven", "phone"};
 
        String[] moreItems4 = Arrays.copyOf(items4, 2);
        items4[1] = "sofa";
        System.out.println(Arrays.toString(items4)); //"clock", "sofa", "ladder", "chair", "oven", "phone"
        System.out.println(Arrays.toString(moreItems4)); //"clock", "table"
        //////////7
        String[] items5 = {"clock", "table", "ladder", "chair", "oven", "phone"};
        function(items5);
        System.out.println(items5[0]);//bed
         ////////////
         String[] items6 = {"clock", "table", "ladder", "chair", "oven", "phone"};
         function6(items6);
         System.out.println(items6[0]);// bed - The parameter copies the value inside items: a reference. Then, moreItems copies the same reference. All variables (parameter included) share a reference to the same array. So, changing moreItems will change the state of the items argument.
        //////////////
        String[] items7 = {"clock", "table", "ladder", "chair", "oven", "phone"};
        function7(items7);
        System.out.println(items7[0]);//clock - The moreItems' array is independent from the items' array.

        
    }
    // not in main!!!
    public static void function(String[] items5) {
            items5[0] = "bed";
    }
    public static void function6(String[] items6) {
            String[] moreItems = items6;
            moreItems[0] = "bed";
    }    
    public static void function7(String[] items7) {
        String[] moreItems7 = Arrays.copyOf(items7, items7.length);
        moreItems7[0] = "bed";
    }
}