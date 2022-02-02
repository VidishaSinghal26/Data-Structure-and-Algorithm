public class PrimeNoList {
    Node head;
    public void push(Node newnode)
    {
        if(head==null)
        {
            head = newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next != null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.previous=temp; // for doubly linked list
        }
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("Empty List");
        }
        else
        {
            Node temp=head;
            while(temp != null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public void check(PrimeNoList obj1)
    {
        int f=0;
        Node temp=head;
        while(temp != null) {
            for (int i = 1; i <=temp.data/2; i++) {

                if (temp.data % i == 0 && i != 1) {
                    f = 1;
                    break;
                }
            }
            if(f==0)
                {
                    obj1.push(new Node(temp.data));
                }
            temp=temp.next;
            f=0;
        }

    }
    public static void main(String[] args) {
        PrimeNoList obj = new PrimeNoList();
        PrimeNoList obj1 = new PrimeNoList();
        obj.push(new Node(101));
        obj.push(new Node(201));
        obj.push(new Node(45));
        obj.push(new Node(12));
        obj.push(new Node(3));
        obj.push(new Node(691));
        
        obj.display();
        obj.check(obj1);
        System.out.println("Prime no present in list");
        obj1.display();

    }
}
