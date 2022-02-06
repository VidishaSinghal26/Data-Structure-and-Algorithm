import java.util.Scanner;

public class Position {
    Node head;
    public void push(Node newnode) {
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    public  void display(int pos)
    {
        if(head == null )
        {
            System.out.println("Linked list is empty");;
        }
        // System.out.println(head);
        Node temp=head;

        for (int i = 0; i < pos+1; i++) {
            if(pos==i){
                System.out.println(temp.data);
            }
            else
                temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no of test cases");
        int t = sc.nextInt();int data;
        for (int i = 1; i <= t; i++) {
            System.out.println("Enter " + i + " list elements");
            data = sc.nextInt();
            Position obj = new Position();
            while (data != -1) {
                obj.push(new Node(data));
                data = sc.nextInt();
            }
            int pos=sc.nextInt();
            obj.display(pos);

        }

    }

}
