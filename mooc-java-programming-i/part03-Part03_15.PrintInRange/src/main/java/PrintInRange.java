
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here

    }

    public static void printNumbersInRange(ArrayList<Integer> number, int lowerLimit, int upperLimit) {

        for (Integer numberN : number) {
            if (numberN >= lowerLimit & numberN <= upperLimit) {
                System.out.println(numberN);
            }
        }
    }
}
