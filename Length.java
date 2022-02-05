import java.util.Scanner;

public class Length {
    Node head;
    public  int length()
    {
        int c=0;
        Node temp= head ;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }

        return c;
    }
    public void push(Node newnode)
    {
        if(head ==null)
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
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter no of test cases");
        int t = sc.nextInt();int data;
        for (int i = 1; i <= t; i++) {
            System.out.println("Enter " + i + " list elements");
            data = sc.nextInt();
            Length obj = new Length();
            while (data != -1) {
                obj.push(new Node(data));
                data = sc.nextInt();
            }
            System.out.println(obj.length());
        }

    }

    }

class Node {
    int data;
    Node next;
    Node previous;
    Node(int data)
    {
        this.data=data;
    }
}