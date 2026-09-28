//package circularQueue;

import java.util.Arrays;
import java.util.Scanner;

public class CircularApplication implements Circular {

    private int front;
    private int rare;
    private int capacity;
    private int count;
    private int[] array;

    public CircularApplication(int size)
    {
        capacity = size;
        front = 0;
        rare = -1;
        count = 0;
        array = new int[capacity];
    }
    @Override 
    public void enQueue(int num) 
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        rare = (rare+1) % capacity;
        array[rare] = num;
        count++;
        System.out.println("Element inserted");
    }

    @Override 
    public int deQueue() throws QueueEmptyException
    {
        if(isEmpty())
        {
            throw new QueueEmptyException("Queue Empty Exception");
        }
        int temp = array[front];

        front = (front+1) % capacity;
        count--;
        return temp;
    }
    @Override 
    public int peek() throws QueueEmptyException
    {
        if(isEmpty())
        {
           throw new QueueEmptyException("Queue Empty Exception");
        }
        return array[front];
    }

    @Override 
    public void display() throws QueueEmptyException
    {
        if(isEmpty())
        {
            throw new QueueEmptyException("Queue Empty Exception");
        }
        System.out.print(Arrays.toString(array)+" ");
    }
    @Override 
    public boolean isEmpty()
    {
        return count == -1;
    }

    @Override 
    public boolean isFull()
    {
        return count == capacity;
    }

    public static void main(String[] args) throws QueueEmptyException {
        CircularApplication q1 = new CircularApplication(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Insert");
        System.out.println("Enter 2 for Delete top Element");
        System.out.println("Enter 3 for Top Element");
        System.out.println("Enter 4 for Display Queue");
        System.out.println("Enter 5 for to Check Queue is Empty or not");
        System.out.println("Enter 6 for to Check Queue is full or not");
        System.out.println("Enter 7 for Exit");
        while(true)
        {
            System.out.println("Enter an Option:");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter number to insert Value");
                    int n1 = sc.nextInt();
                    q1.enQueue(n1);
                    break;
                case 2:System.out.println("Deleted Element:"+q1.deQueue());
                    break;
                case 3:System.out.println("Top Element:"+q1.peek());
                    break;
                case 4:q1.display();
                    break;
                case 5:System.out.println("Queue is Empty:"+q1.isEmpty());
                    break;
                case 6:System.out.println("Queue is Full:"+q1.isFull());
                    break;
                case 7:System.out.println("Exit");
                    return ;
                default:
                    break;
            }
        }
        // q1.enQueue(55);
        // q1.enQueue(5);
        // System.out.println("Element Deleted:"+q1.deQueue());
        // System.out.println("Element:"+q1.peek());
        // System.out.println("Element Deleted:"+q1.deQueue());
        
        // q1.display();
    }
}