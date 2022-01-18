import java.util.ArrayList;
import java.util.Scanner;

public class MrRaman {
    int n,m;int count =0,b=1;
    public MrRaman(ArrayList myarr1,ArrayList myarr2)
    {
        Scanner sc = new Scanner ( System.in);
        n= sc.nextInt();
        m=sc.nextInt();
        for (int i=0;i<n;i++)
        {
            myarr1.add(sc.nextInt());
        }
        for (int i=0;i<m;i++)
        {
            myarr2.add(sc.nextInt());
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> myarr1 =new ArrayList<>();
        ArrayList<Integer> myarr2 =new ArrayList<>();
        MrRaman obj = new MrRaman(myarr1,myarr2);
        for (int i=0;i<myarr1.size();i++)
        {
            for (int j=0;j <myarr2.size();j++)
            {
                if(myarr2.get(j) >= myarr1.get(i))
                {
                   obj.count++;
                }
            }
            System.out.print(obj.count);
            if (obj.b<myarr1.size()){
                System.out.print(",");
                obj.b++;
            }
            obj.count =0;
        }


    }
}
