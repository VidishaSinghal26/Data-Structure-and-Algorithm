import java.util.Scanner;

public class ReverseQueueElements {
    int front;
    int rear;
    int[] arr;
    ReverseQueueElements(int size)
    {
        front =-1;
        rear=-1;
        arr = new int[size];
    }
    public boolean isFull()
    {
        if(rear==arr.length)
            return true;
        else
            return false;
    }
    public boolean isEmpty()
    {
        if(front==-1)
            return true;
        else
            return false;
    }
    public  void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("overflow");
        }
        else if(isEmpty())
        {
         front++;
         rear++;
         arr[front]=data;
        }
        else
        {
            rear++;
            arr[rear]=data;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        ReverseQueueElements obj=new ReverseQueueElements(size);
        int k=sc.nextInt();
        for (int i = 0; i < size; i++) {
            obj.enqueue(sc.nextInt());
        }
        for (int i = k-1; i >= 0; i--) {
            System.out.print(obj.arr[i]+" ");
        }
        for (int i = k; i <size ; i++) {
            System.out.print(obj.arr[i]+" ");
        }
    }
}
