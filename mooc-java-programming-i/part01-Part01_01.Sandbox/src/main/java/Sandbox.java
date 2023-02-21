import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here

        Scanner reader = new Scanner(System.in);

        // System.out.println("Give a word: ");
        // String mystr = reader.nextLine();
        // System.out.println(mystr);
        // boolean isEqual = mystr.equals("asd");
        // System.out.println(isEqual);

        String a = "3";
        String b = "3";
        if (a.equals(b)) {
            System.out.println("Bunlar esit");
        } else {
            System.out.println("Bunlar esit degil");
        }

        String[] arrayOfStrings = { "Matti L.", "Matti P.", "Matti V." };
        double[] arrayOfFloatingpoints = { 1.20, 3.14, 100.0, 0.6666666667 };

        for (int i = 0; i < arrayOfFloatingpoints.length; i++) {
            System.out.println(arrayOfStrings[i] + " " + arrayOfFloatingpoints[i]);
        }

    }
}

// import java.util.Scanner;

// public class LineByLine {

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// String myStr = scanner.nextLine();
// if (!(myStr.equals(""))) {
// String[] pieces = myStr.split(" ");
// for (String piece : pieces) {
// System.out.println(piece);
// }
// }
// }
// }
