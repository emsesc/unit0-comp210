//-------------------------------
//        prog 4
//        -------------------------------
//        program that has
//        -- three classes: Main, Prodder, Summer
//        -- Main and Summer same as prog 3 basically
//        -- Prodder is like Summer except it has a method "product"
//        instead of "summer"
//        -- method product computed the product of the integers from
//        1 to the positive integer passed to it
//        -- in Main.main, get a positive integer from the user keyboard
//        -- in Main.main, make one object of class Summer, and make
//        another object of class Prodder
// -- call the product method of the object of class Prodder...
//        it return to Main.main a positive integer
//        -- then pass that returned integer into the summer method
//        of the object of class Summer... it returns to Main.main
//        another integer
//
//        -- Main.main prints out the integer returned from the Summer object
//        call to summer method
//
//        input: 5    output:                   7,260
//        input: 7    output:              12,703,320
//        input: 10   output:       6,584,096,534,400
//        input: 11   output:     796,675,481,078,400
//        input: 12   output: 114,721,266,640,780,800
//        input: 13   output: 941,149,951,220,278,784
//
//        input of 14 will overflow a variable of type "long"
//        long is 8 bytes and holds integers
//        from -9,223,372,036,854,775,808
//        to  9,223,372,036,854,775,807

import java.util.Scanner;
public class Four {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();

        Summer s = new Summer();
        Prodder p = new Prodder();
        System.out.println(s.summer(p.product(num)));
    }
}

//class Summer {
//    public static int summer(int x) {
//        int sum = 0;
//        for (int i = 1; i < x + 1; i ++) {
//            sum += i;
//        }
//
//        return sum;
//    }
//}

class Prodder {
    public static int product(int x) {
        int prod = 1;
        for (int i = 1; i < x + 1; i ++) {
            prod *= i;
        }

        return prod;
    }
}
