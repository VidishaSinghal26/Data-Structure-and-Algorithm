import java.util.Scanner;

public class SumByRec {
    Scanner sc= new Scanner (System.in);
    public int sum(int n)
    {
     if(n !=0 )
     {
         int c=sc.nextInt();
         int s=sum(n-1);
         return c+s;
     }
     else{
         return 0;
     }
    }

    public static void main(String[] args) {
        SumByRec obj=new SumByRec();
        int n=obj.sc.nextInt();
        System.out.println(obj.sum(n));
    }
}
