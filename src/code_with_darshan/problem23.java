class Arithmetic {

    int add(int c, int b){

        return c+b;
    }
}

class Adder extends Arithmetic{


}

public class problem23 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        System.out.print(a.add(10,32)  + " " + a.add(10,3) + " " + a.add(10,10) + "\n");


    }
}
