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
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));
        
    }
}