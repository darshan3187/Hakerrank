package code_with_darshan;

import java.util.ArrayList;
import java.util.Scanner;

public class problem18 {
    public static void main(String[] args) {
        ArrayList<Character> AL = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        s.toLowerCase();



       for (char ch : s.toCharArray()) {
            if (ch != ' ' && !AL.contains(ch)) {
               AL.add(ch);
            }
       }
        System.out.println(AL.size());
    }
}
