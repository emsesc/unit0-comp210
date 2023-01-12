//-------------------------------
//        prog 3
//        -------------------------------
//        program that has
//        -- two classes, Main, and Summer
//        -- Main contain the main method
//        -- Summer contains the method summer
//        -- in Main.main create an object of class Summer
//  -- in Main.main, get a positive integer from the keyboard
//          -- in Main.main, call the summer method in the object of class Summer
//     pass it the integer from the user
//  -- summer works as it did in prog 2... returns the sum of integers
//          from 1 to the one passed to it
//          -- Main.main prints the sum
//
//          input: 100   output: 5050
//          input: 5     output: 15
//          input: 4321  output: 9337681
import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();

        Summer s = new Summer();
        System.out.println(s.summer(num));
    }
}

class Summer {
    public static int summer(int x) {
        int sum = 0;
        for (int i = 1; i < x + 1; i ++) {
            sum += i;
        }

        return sum;
    }
}
