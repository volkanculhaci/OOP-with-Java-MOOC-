
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is
        // gradually extended part by part.

        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give numbers:");

        int total = 0;
        int countNum = 0;
        int evenCount = 0;
        int oddCount = 0;

        int userInput = Integer.valueOf(scanner.nextLine());

        while (userInput != -1) {

            total += userInput;
            countNum += 1;

            if (userInput % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }
            userInput = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + total);
        System.out.println("Numbers: " + countNum);
        System.out.println("Average: " + (total * 1.0 / countNum));
        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
    }
}