
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String myStr = scanner.nextLine();
            if ((myStr.equals(""))) {
                break;
            } else {
                String[] pieces = myStr.split(" ");
                System.out.println(pieces[0]);
            }
        }
    }
}
