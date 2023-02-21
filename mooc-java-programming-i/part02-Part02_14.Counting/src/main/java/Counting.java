
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int endnum = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < endnum + 1; i++) {

            System.out.println(i);
        }
    }
}
