import java.util.Scanner;

public class Permutation {
   static char temp;

    public static void permu(String s,String res)
    {
        if(s.length() ==0)
        {
            System.out.println(res+" ");
            return;
        }
       for( int i=0; i< s.length();i++)

       // while(i <s.length()-1)
        {
            char ch = s.charAt(i);
           String ss = s.substring(0,i)+s.substring(i+1);
            permu(ss, res+ch);
            //i++;
        }

    }
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String s= sc.next();
          String res="";
          permu(s,res);
    }
}
