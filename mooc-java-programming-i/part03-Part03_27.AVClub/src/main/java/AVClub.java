
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String mystr = scanner.nextLine();
            if (mystr.equals(""))
                break;
            String[] words = mystr.split(" ");
            for (String word : words) {
                if (word.contains("av")) {
                    System.out.println(word);
                }
            }

        }
    }
}
