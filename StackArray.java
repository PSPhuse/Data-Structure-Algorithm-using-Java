import java.util.Arrays;

public class StackArray implements StackADT{

    int[] arr = new int[20];
    int top = -1;
    @Override
    public void push(int element)
    {
        if(isFull())
        {
            System.out.println("Stack is Full");
            return;
        }
        arr[++top] = element;
        System.out.println("ELEMENT pushed");
    }

    @Override 
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            return 0;
        }
        
        return arr[top--];
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }
    public void array()
    {
        System.out.println(Arrays.toString(arr));
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == arr.length-1;
    }
}
