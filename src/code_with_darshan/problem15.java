package code_with_darshan;
import java.util.*;
public class problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String delimeter = "[!\\s,\\._'@?]+";
        String [] parts = s.trim().split(delimeter);
        System.out.println(parts.length);
        sc.close();
    }

}
