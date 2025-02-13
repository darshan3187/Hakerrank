package code_with_darshan;
import java.text.NumberFormat;
import java.util.*;


public class problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " +  NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment));
        System.out.println("China: " +  NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " +  NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }
}
