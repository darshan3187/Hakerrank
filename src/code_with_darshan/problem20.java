import java.util.Scanner;


public class problem20 {

    interface AdvancedArithmetic{
        int divisor_sum(int n);
    }

    //Write your code here
    static class MyCalculator implements AdvancedArithmetic{
        public int divisor_sum(int n){
            int sum = 0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    sum+=i;
                }
            }
            return sum;
        }
    }


        public static void main(String[] args){
            MyCalculator my_calculator = new MyCalculator();
            System.out.print("I implemented: AdvancedArithmetic");

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.print(my_calculator.divisor_sum(n) + "\n");
            sc.close();
        }
}

