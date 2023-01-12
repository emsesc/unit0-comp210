//-------------------------------
//        prog 1
//        -------------------------------
//        program that has
//        -- one class,
//        -- that class contains  one method: main
//        -- does all its work in main
//        -- work: sum up all integers from 1 to 100 and print the sum.
//
//        has no user input
//        output: 5050
public class One {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i ++) {
            sum += i;
        }
        System.out.println(sum);
    }
}