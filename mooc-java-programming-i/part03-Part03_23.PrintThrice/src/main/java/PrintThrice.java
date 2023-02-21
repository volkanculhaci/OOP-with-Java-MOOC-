
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        String aWord = String.valueOf(scanner.nextLine());
        int k = 0;
        while (k < 3) {
            System.out.println(aWord);
            k++;
        }
    }
}
