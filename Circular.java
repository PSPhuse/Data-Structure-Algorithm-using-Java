//package circularQueue;

public interface Circular {

    void enQueue(int num);
    int deQueue() throws QueueEmptyException;
    int peek() throws QueueEmptyException;
    void display() throws QueueEmptyException;
    boolean isEmpty();
    boolean isFull();
}
