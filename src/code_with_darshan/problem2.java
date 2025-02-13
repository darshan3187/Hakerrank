package code_with_darshan;

import java.util.Scanner;

public class problem2 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d\n",s1,x);
                /*the "%-15s" part ensures that the string is left-justified and takes up exactly 15 characters of space.
                 If the string is shorter than 15 characters, it pads the remaining space with spaces on the right.
                the "%03d" makes sure that the number on the input will have 3 digits on the output by fixing
                the number on the right (right aligned) and adding zeros on the left when needed.
                finally, the \n is there just to move the cursor to the next line after printing.*/
            }

            System.out.println("================================");

        }
}
