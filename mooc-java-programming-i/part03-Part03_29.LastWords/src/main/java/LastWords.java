
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String myStr = scanner.nextLine();
            if ((myStr.equals(""))) {
                break;
            } else {
                String[] pieces = myStr.split(" ");
                System.out.println(pieces[pieces.length - 1]);
            }
        }

    }
}
