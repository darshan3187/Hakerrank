package code_with_darshan;
import java.util.*;
public class problem4 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int value = a;
                for(int j=0 ; j<n ; j++){
                    value += (int)Math.pow(2,j) * b;
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        System.out.println();
            in.close();
    }
}
