package code_with_darshan;
import java.util.*;
public class problem7
{
    static int B;
    static int H;
    static boolean flag;
    static
    {
        Scanner sc = new Scanner(System.in);

        B = sc.nextInt();
        H = sc.nextInt();
        try
        {
              if (B <= 0 || H<=0)
              {
                 flag = false;
                 throw(new Exception("java.lang.Exception: Breadth and height must be positive"));
              }else
                {
                  flag = true;
                }
        }catch(Exception e)
            {
              System.out.print(e.getMessage());
            }
    }

    public static void main(String[] args)
    {
        if(flag)
        {
            int area=B*H;
            System.out.print(area);
        }

    }//end of main
}
