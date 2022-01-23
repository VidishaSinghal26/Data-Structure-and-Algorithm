import java.util.Scanner;

public class ChangeByRec {
    public static String change(String ss,char c1,char c2)
    {

        if (ss.length() <= 0)
        {
            return ss;
        }
        if(ss.charAt(0) == c1) {
            ss = c2 + ss.substring(1);
        }

        return ss.charAt(0)+change(ss.substring(1),c1,c2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String ss= sc.next();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        System.out.println(change(ss,c1,c2));
       // System.out.println(ss.replace('a','x'));
   }
}
