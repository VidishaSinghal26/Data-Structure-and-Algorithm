import java.util.Scanner;

public class Power {
    public static int pow(int x,int n)
    {
        if (n != 0) {
            int c = pow(x, n - 1);
            return x * c;
        }
        else
        {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n=sc.nextInt();
        System.out.println(pow(x,n));
    }
}
