public class Scope {                                                         static int dogs = 7;              //
    public static void main(String[] args) {     //                                                //
        int apples = 5;                         //  1. scope                                        //        CLASS SCOPE
        System.out.println(dogs);
        someFunction();                         //                                                //
    }                                                                                               // 
    public static void someFunction(){          //                                                //
        System.out.println(apples);             // 2. scope   
        System.out.println(dogs);                                             //

    }
    

}  // cant access the variables outside the scope
// when you declare a variable inside the class scope it is accessible from anywher