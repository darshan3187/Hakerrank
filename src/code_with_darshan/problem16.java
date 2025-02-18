package code_with_darshan;

import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x,days,months,years;

        years = n/365;
        x = n%365;
        months = x/30;
        days = x%30;

        System.out.println(years + " years and " + months + " months and " + days + " days");

    }
}
