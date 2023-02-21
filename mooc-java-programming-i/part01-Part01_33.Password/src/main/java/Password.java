
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Password?");
        String entry = scan.nextLine();
        String pw = "Caput Draconis";
        if (pw.equals(entry)) {
            System.out.println("Welcome!");

        } else {
            System.out.println("Off with you!");
        }
    }
}
