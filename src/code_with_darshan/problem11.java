package code_with_darshan;

import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();

        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println(A.substring(start,end));
    }
}
