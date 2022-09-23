import java.util.Arrays;//utilitie class

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        String menuString = Arrays.toString(menu);// the function toString - takes array as an argument and it returns string that we can print - stor this string in a string variable - menuString
        System.out.println(menuString);//["Espresso", "Iced Coffee", "Macchiato"]
        menu[2]= "Latte";
        System.out.println(Arrays.toString(menu));        //or u can have just one line instead of storing in a variable
        //if you want to expand the menu you can make a new array that can hold more elements than old one(just3)
        String[] newMenu = new String[5];

        for(int i=0; i<menu.length; i++) { 
        System.out.println(i+". "+ menu[i]);
        newMenu[i] = menu[i];
        }
        newMenu[3] = "House Blend";//[Espresso, Iced Coffee, Latte, null, null] - updating elements
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
////////
String[] items = new String[5];
items[10%2] = "cup";//0
int[] numbers = new int[3];
numbers[5%1] = 3;//1
 
System.out.println(items[0]);
System.out.println(items[1]);
System.out.println(numbers[0]);
System.out.println(numbers[1]);//cup null 3 0
///////////
    String[] items2 = {"clock", "table", "ladder", "chair", "oven", "phone"};
        String[] moreItems2 = new String[6];
 
        for (int i = 0; i < 3; i++) {
            moreItems2[i] = items2[i];//clock, table, ladder, null, null, null
        }
///////////////
        String[] items3 = {"clock", "table", "ladder", "chair", "oven", "phone"};
        String[] moreItems3 = new String[6];
 
        for (int i = (moreItems3.length - 1); i >= 3; i--) {
            moreItems3[i] = items3[i];// The loop starts at index 5 and decreases to index 3.
            //null, null, null, chair, oven, phone
        }
///////////
    String[] items4 = {"clock", "table", "ladder", "chair", "oven", "phone"};
    String[] moreItems4 = new String[6];

    for (int i = (moreItems4.length - 1); i >= 1; i--) {
    if (i % 2 == 0) {
        moreItems4[i] = items4[i];//The loop starts at index 5 and decreases to index 1. During each run, it only updates even indexes: 4, 2
            //null, null, ladder, null, oven, null

        } 
    }   
    ////////77
    String[] items5 = {"clock", "table", "ladder", "chair", "oven", "phone"};
        String[] moreItems5 = new String[6];
 
        for (int i = (moreItems5.length - 1); i >= 1; i--) {
            if (i % 2 != 0) {
                continue;
            } 
            moreItems5[i] = items5[i];//The loop starts at index 5 and decreases to index 1. If the index is odd, continue skips the current run.
            //null, null, ladder, null, oven, null

        }

    }
}
