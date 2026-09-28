package QueueOperation;

public interface QueueOpe {

    void enQueue(int a);
    int deQueue();
    int peek();
    boolean isEmpty();
    boolean isFull();
}
