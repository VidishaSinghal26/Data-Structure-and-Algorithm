import java.util.Scanner;

public class DupByRec {
    public static String delete(String s)
    {
        if (s.length() <= 1)
        {
            return s;
        }
        if(s.charAt(0)==s.charAt(1))
        {
            s=s.substring(1);
            return delete(s);
        }
        else{
         return s.charAt(0)+delete(s.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
       // System.out.println(s.substring(0,1));
        System.out.println(delete(s));
    }
}
