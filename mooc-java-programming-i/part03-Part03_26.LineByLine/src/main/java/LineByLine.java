
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String myStr = scanner.nextLine();
            if ((myStr.equals(""))) {
                break;
            } else {
                String[] pieces = myStr.split(" ");
                for (String piece : pieces) {
                    System.out.println(piece);

                }
            }
        }
    }
}
