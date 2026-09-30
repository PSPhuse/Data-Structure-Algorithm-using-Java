//package linkedList;

public class ListApplication implements ListInterface {

    Node head;
    @Override 
    public void addFront(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head; 
        head = newNode;
    }
    @Override 
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
            addFront(data);

        Node temp = head;
        while (temp.next!=null) {
            temp = head.next;
        }
        temp.next = newNode;
    }
    @Override 
    public int deteleFront()
    {
        if(isEmpty())
            return -1;

        Node temp = head;
        head = head.next;

        return temp.data;
    }
    @Override 
    public int deleteLast()
    {
        if(isEmpty())
            return -1;

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;

        }
        Node delete = temp.next;
        temp.next = null;
        return delete.data;
    }
    @Override 
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    @Override
    public boolean isEmpty()
    {
        return head == null;
    }
    public static void main(String[] args) {
        ListApplication l1 = new ListApplication();
        l1.addFront(25);
        l1.addFront(255);
        l1.addFront(2);
        l1.addFront(5);
        l1.display();
        System.out.println("\nDelete Front:"+l1.deteleFront());
        System.out.println("Delete Last:"+l1.deleteLast());
        l1.display();
        System.out.println("\nLinked List is Empty: "+l1.isEmpty());
    }
}
