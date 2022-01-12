import java.util.Scanner;

public class MrBean {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int f=1;int c=0;
        for ( int i =1;i<=n;i++)
        {
            f=f*i;
        }
       // System.out.println(f);
        while(f>0)
        {
            if (f%10==0)
            {
                c++;
            }
            f=f/10;
        }
        System.out.println(c);
    }
}
