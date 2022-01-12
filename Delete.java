import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
      //  int arr[] = new int[n];
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for (int i=0;i<n;i++)
        {
           arr.add(sc.nextInt());
           // arr[i] = sc.nextInt();
        }
        for (int i=0;i < arr.size() ;i++)
        {
            for (int j=0;j < arr.size();j++)
            {
                if(Objects.equals(arr.get(i), arr.get(j)) && i!=j)
                {
                    //arr[i]=0;
                    arr.remove(j);
                }
            }
            System.out.print(arr.get(i)+" ");
        }

//        for (int i=0;i<n;i++)
//        {
//            if(arr[i] != 0)
//            {
//                System.out.print(arr[i] +" ");
//            }
//
//       }

    }
}
