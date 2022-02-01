import java.util.Scanner;

class SinglyLinkedList {
    Node head;
    public int count(int c)
    {
        Node temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;

    }
    public void insertAtLast( Node newnode) {
        if (head == null) {
            head = newnode;
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;

        }
    }
    public void insertAtBeginning( Node newnode) {
        if (head == null) {
            head = newnode;
        }
        else {
            newnode.next = head;
            head = newnode;
        }
    }

    public void insertAtPosition(int pos,Node newnode)
    {
        Node temp=head;
        for (int i = 0; i < pos-1; i++) {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void deleteFromBeginning()
    {
        if(head == null)
        {
            System.out.println("empty linked list");
        }
        else
        {
            head = head.next;
        }
    }
    public void deleteFromLast()
    {
        if(head == null)
        {
            System.out.println("Empty list");
        }
        else {
            Node temp = head;
            while(temp.next.next != null)
            {
                temp=temp.next;
            }
            temp.next=null;
        }
    }
    public void deleteFromPosition(int pos)
    {
        Node temp=head;
        for (int i = 0; i < pos-1; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
    public  void display()
    {
        if(head == null )
        {
            System.out.println("Linked list is empty");;
        }
       // System.out.println(head);
        Node temp=head;
        while(temp != null)
        {
            System.out.println(temp.data+" refernce of that node: "+temp+" reference of next node: "+temp.next);
            temp=temp.next;
        }
    }

}

class Node {
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}


class Main {
    public static void main(String[] args) {
        Scanner sc  =new Scanner (System.in);
        SinglyLinkedList obj = new SinglyLinkedList();
        System.out.println("Inserting some values in list on which we will perform operations ");
        obj.insertAtLast(new Node(sc.nextInt()));
        obj.insertAtLast(new Node(sc.nextInt()));
        obj.insertAtLast(new Node(sc.nextInt()));

        System.out.println("Enter 1 to insert value at given position\n"+"Enter 2 to insert value at beginning\n"+
                "Enter 3 to insert value at last\n"+"Enter 4 to delete value from given position\n"+
                "Enter 5 to delete value from beginning\n"+"Enter 6 to delete value from last");
        System.out.println("Enter a choice");
        int ch = sc.nextInt();int pos;

        int count= obj.count(0);
        //  System.out.println(count);
        switch (ch)
        {
            case 1:
                System.out.println("Enter position and data value");
                pos= sc.nextInt();
                if(pos > count)
                    obj.insertAtLast(new Node(sc.nextInt()));
                else
                    obj.insertAtPosition(pos,new Node(sc.nextInt()));
                obj.display();
                break;
            case 2:
                System.out.println("Enter data value ");
                obj.insertAtBeginning(new Node(sc.nextInt()));
                obj.display();
                break;
            case 3:
                System.out.println("Enter data value ");
                obj.insertAtLast(new Node(sc.nextInt()));
                obj.display();
                break;
            case 4:
                System.out.println("Enter position ");
                pos= sc.nextInt();
                if (pos > count)
                    System.out.println("Position out of range");
                else {
                    obj.deleteFromPosition(pos);
                    obj.display();
                }
                break;
            case 5:
                System.out.println("Enter data value ");
                obj.deleteFromBeginning();
                obj.display();
                break;
            case 6:
                obj.deleteFromLast();
                obj.display();
                break;
            default:
                System.out.println("Invalid input");

        }

    }
}

