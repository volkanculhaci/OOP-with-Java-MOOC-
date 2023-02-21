
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        while (true) {
            String oldestName = "";
            String userInput = scanner.nextLine();
            if (userInput.equals("")) {
                break;
            } else {
                String[] pieces = userInput.split(",");
                names.add(pieces[0]);
                ages.add(Integer.valueOf(pieces[1]));
            }
        }
        int oldest = 0;
        String oldestName = "";
        for (int i = 0; i < ages.size(); i++) {
            if (ages.get(i) > oldest) {
                oldest = ages.get(i);
                oldestName = names.get(i);
            }
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
