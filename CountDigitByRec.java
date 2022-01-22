import java.util.Scanner;

public class CountDigitByRec {
    public static int count(int n)
    {
        if(n != 0)
        {
            int c=count(n/10);
           // System.out.println(c);
            return c+1;
        }
        else
        {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println(count(n));
    }
}
