
public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(4);
    }

    public static void printFromNumberToOne(int number) {
        int i = number;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
    }
}
