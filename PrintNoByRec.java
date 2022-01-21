import java.util.Scanner;

public class PrintNoByRec {
    public static int print(int n)
    {
        if(n >1)
        {
            System.out.print( print(n-1)+" ");
            return n;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println(print(n));
    }
}
