public class AccessStack {

    public static void main(String[] args) {
        StackArray sa = new StackArray();

        sa.push(56);
        sa.push(1);
        sa.push(65);

        System.out.println(sa.peek());
        System.out.println(sa.pop());
        System.out.println(sa.isFull());
        sa.array();
    }
}
