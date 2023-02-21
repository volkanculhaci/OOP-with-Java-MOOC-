
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        if (gift >= 5000 && gift < 25000) {
            System.out.println((gift - 5000) * 0.08 + 100);

        } else if (gift >= 25000 && gift < 55000) {
            System.out.println((gift - 25000) * 0.1 + 1700);
        } else if (gift >= 55000 && gift < 200000) {
            System.out.println((gift - 55000) * 0.12 + 4700);
        } else if (gift >= 200000 && gift < 1000000) {
            System.out.println((gift - 200000) * 0.15 + 22100);
        } else if (gift >= 1000000) {
            System.out.println((gift - 1000000) * 0.17 + 142100);
        } else if (gift < 5000) {
            System.out.println("No tax!");
        }
    }
}
