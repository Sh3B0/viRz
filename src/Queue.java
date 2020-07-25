// My first java class)

public class Queue<T> {

    Node front = new Node();
    Node back = new Node();
    private int sz = 0;

    class Node {
        T item;
        Node next;
    }

    void push(T t) {

        Node cur = new Node();
        cur.item = t;
        back.next = cur;
        back = cur;
        if (sz == 0) {
            front = back;
        }
        sz++;
    }

    boolean empty() {
        return sz == 0;
    }

    T pop() {
        if (sz == 0) throw new NullPointerException("Queue is empty");
        T t = front.item;
        front = front.next;
        sz--;
        return t;
    }
}