public class variables1 {
    // variable is one kind of name which used to store value in it.
    // num1 = 20, here num1 is a variable
    // we can only use (A....Z, a...z), (0,1,...9,), '_', '$';
    // we can't start any variables with a number as first letter
    // we can't use any keyword as variable
    // we can't put any space in between the name of variable

    // some examples : num1, num2, alif, _Imtiaj, role_number, value$

    /*
     * data types
     * 
     * which type of data are going to be stored on variables is called data type.
     * there are mainly two types of data types, 1. Primitive , 2. Non-primitive 
     * 
     * -- Primitive --
     * {
     * Primitive are 2 types.
     * 1 -> boolean 2 -> Numeric
     * 
     * Numeric are 2 types.
     * 1 -> Character 2 -> Integral
     * 
     * Integral are 2 types.
     * 
     * 1 -> Integer 2 -> Floating
     * 
     * Integer are 4 types.
     * 1 -> byte 2 -> short 3 -> int 4 -> long
     * 
     * Floating-point are 2 types.
     * 
     * 1 -> float 2 -> Double
     * }
     * 
     * -- Non-premitive --
     * Non-primitve data types are {string, Array etc.}
     */



     /*
      * variable declaration syntax:-
      * data_type variable_name;
      */

      public static void main(String[] args) {

        boolean b;
        char c;
        short s;
        int i;
        float f;
        double d;

        b = true;

        System.out.println("B = "+b);
        
      }
}
