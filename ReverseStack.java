import java.util.Scanner;

class StackNode {

        char data;
        StackNode next;

        public StackNode(char data)
        {
            this.data = data;
            this.next = null;
        }
    }

    class ReverseStack {

        StackNode top;
        String ss1="";
        public void push(StackNode newnode)
        {
            if (top == null) {
                top=newnode;
                return;
            }
            newnode.next = top;
            top = newnode;
        }

        public void display()
        {

            StackNode temp = top;
            while (temp != null) {
                System.out.print(temp.data+"");
                ss1=temp.data+ss1;
                temp = temp.next;
            }
            System.out.println();
        }
        public void checkpalin(String ss)
        {
            if(ss.equals(ss1))
            {
                System.out.println("Palindrome");
            }
            else
                System.out.println("Not Palindrome");
        }

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            ReverseStack s = new ReverseStack();
            String ss=sc.next();
            System.out.println("Original String");
            System.out.println(ss);
            for (int i = 0; i < ss.length(); i++) {
                s.push(new StackNode(ss.charAt(i)));
            }
            System.out.println("Reversed String");
            s.display();
            s.checkpalin(ss);
        }
    }

