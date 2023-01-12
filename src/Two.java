//-------------------------------
//        prog 2
//        -------------------------------
//        program that has
//        -- one class,
//        -- that class contains two methods: main and summer
//        -- main gets a positive integer from the kayboard
//        -- main calls summer, passes that integer to summer
//        -- summer sums up all positive integers from 1 to the one
//        given at the kayboard and passed in to summer
//        -- summer returns the sum to main
//        -- main prints the sum
//
//        input: 100   output: 5050
//        input: 5     output: 15
//        input: 4321  output: 9337681

import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int num = myObj.nextInt();
        System.out.println(summer(num));
    }

    public static int summer(int x) {
        int sum = 0;
        for (int i = 1; i < x + 1; i ++) {
            sum += i;
        }

        return sum;
    }
}
