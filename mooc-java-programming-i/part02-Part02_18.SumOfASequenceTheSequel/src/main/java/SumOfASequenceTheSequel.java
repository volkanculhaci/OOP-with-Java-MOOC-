
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("first number?");
        int firstnum = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number?");
        int lastnum = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        for (int i = firstnum; i <= lastnum; i++) {
            sum += i;

        }

        System.out.println(sum);
    }
}
