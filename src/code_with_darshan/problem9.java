package code_with_darshan;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class problem9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input year, month, and day
        System.out.print("Enter year (e.g., 2025): ");
        int year = scanner.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        // Get the day of the week
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println("The day of the week is: " + dayOfWeek);

        scanner.close();
    }
}
