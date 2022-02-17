import java.util.LinkedList;

public class FabonacciCLA {
     Node head;
    LinkedList<Integer> ll1 = new LinkedList<>();

    public static void main(String args[]) {
        FabonacciCLA obj = new FabonacciCLA();
        obj.fabomatch(Integer.parseInt(args[0]),args);
    }

    public void fabomatch(int n,String args[]) {
        int t1 = 0;
        int t2 = 1;
        for (int i = 0; i < n; i++) {
            int c = t1 + t2;
            for (int j= 1; j < args.length; j++) {
                int b = Integer.parseInt(args[j]);
                if (b ==i)
                    insert(t1);
            }
            t1 = t2;
            t2 = c;
        }
        display();
    }

    public void insert(int value) {
        Node n1=new Node(value);
        if(head==null)
        {
            head = n1;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=n1;
        }

        }

        public void display ()
        {
            if (head == null) {
                System.out.println("Linked list is empty");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
   }

    class Node1 {
        int data;
        Node next;

        Node1(int data) {
            this.data = data;
        }

    }
