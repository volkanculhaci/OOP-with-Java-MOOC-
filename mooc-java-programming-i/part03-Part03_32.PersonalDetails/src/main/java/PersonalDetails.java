
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        while (true) {
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            } else {
                String[] pieces = userInput.split(",");
                names.add(pieces[0]);
                ages.add(Integer.valueOf(pieces[1]));
            }
        }
        // print longest name
        int longestName = 0;
        String longestNameStr = "";
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > longestName) {
                longestName = names.get(i).length();
                longestNameStr = names.get(i);
            }
        }
        // print average age
        int sum = 0;
        for (int i = 0; i < ages.size(); i++) {
            sum += ages.get(i);
        }
        double averageAge = (double) sum / ages.size();
        System.out.println("Longest name: " + longestNameStr);
        System.out.println("Average of the birth years: " + averageAge);

    }
}
