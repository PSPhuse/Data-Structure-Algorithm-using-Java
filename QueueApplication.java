//package QueueOperation;

import java.util.Scanner;

public class QueueApplication {

    private int size;
    private int front = -1;
    private int rare = -1;
    int[] queue;
 
    public QueueApplication(int capacity)
    {
        size = capacity;
        queue = new int[size];
    }
    //Insert Element in QueueArray
    public void enQueue(int ele)
    {
        if(isFull())
        {
            System.out.println("Cant add Queue Overflow");
            return;
        }
        queue[++rare] = ele;
        System.out.println("Element EnQued...!");
        //Increase front size
        if(front == -1)
            front = 0; 
    }
    //Delete Element in QueueArray
    public int deQueue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
            return 0;
        }
        return queue[front++];
    } 
    //Display topmost Element in QueueArray 
    public int peek()
    {
        if (isEmpty()) {
            System.err.println("Stack is Empty");
            return 0;
        }
        return queue[front];
    } 
    //Check Quque is Fulled Or not
    public boolean isFull()
    {
        return rare == queue.length-1;
    }
   //Chaeck Queue is Empty or not
    public boolean isEmpty()
    {
        if(front == rare || front > rare)
        {
            front = -1;
            rare = -1;
        }
        return front == -1 || front > rare;
    }
    //Display the Entire Queue
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println("Queue Element is:");
            for(int a:queue)
            {
                System.out.print(a+" ");
            }
        }
    }

    public static void main(String[] args) {
        QueueApplication q1 = new QueueApplication(5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for enQue");
        System.out.println("Enter 2 for deQue");
        System.out.println("Enter 3 for peek");
        System.out.println("Enter 4 for Display");
        System.out.println("Enter 5 for isEmpty");
        System.out.println("Enter 6 for isFull");
        System.out.println("Enter 7 for Exit");

        
        while (true) {
        System.out.println("Enter another Choise:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter Number to Ensert int Queue");
                int num = sc.nextInt();
                q1.enQueue(num);
                break;
            case 2:System.out.println("Deleted Element:"+q1.deQueue());
                break;
            case 3:System.out.println("Top of the Queue is:"+q1.peek());
                break;
            case 4:q1.display();
                break;
            case 5:System.out.println("Stack is Empty:"+q1.isEmpty());
                break;
            case 6:System.out.println("Stack is Full:"+q1.isFull());
                break;
            case 7:System.exit(0);
            default:
                break;
        }
        
        }
        // q1.enQueue(5);
        // q1.enQueue(6);
        // q1.enQueue(9);
        
        // System.out.println(q1.deQueue());
        // System.out.println(q1.deQueue());
        // System.out.println(q1.deQueue());
        // System.out.println(q1.peek());

    }
}
        
