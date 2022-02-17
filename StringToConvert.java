import java.util.LinkedList;

public class StringToConvert {
    LinkedList<String> ll=new LinkedList<>();
    public static void main(String[] args) {
        StringToConvert obj=new StringToConvert();
        obj.check(args);
    }
    public void check(String args[])
    {
        for (int i = 0; i < args.length; i++) {
            String temp=" ";
            for (int j = 0; j < args[i].length(); j++) {
                if(args[i].charAt(j)%2==0)
                    temp=temp+"e";
                else
                    temp=temp+"o";
            }
            ll.add(temp);
        }
        System.out.println(ll);
    }
}
