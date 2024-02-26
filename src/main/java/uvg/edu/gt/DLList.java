package uvg.edu.gt;

public class DLList<T> implements UVGLList<T> {
    

    private DoubleNode<T> head = null;
    private DoubleNode<T> tail = null;

    @Override
    public T removeLast() {
        if (tail != null) {
            if (head == tail) {
                T removedData = head.data;
                head = null;
                tail = null;
                return removedData;
            } else {
                T removedData = tail.data;
                tail = tail.prev;
                tail.next = null;
                return removedData;
            }
        }
        return null;
    }

    @Override
    public T getLast() {
        if (tail == null) {
            return null;
        }
        return tail.data;
    }

    @Override
    public void addLast(T x) {
        DoubleNode<T> newNode = new DoubleNode<T>(x);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public int size() {
        int count = 0;
        DoubleNode<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder txt = new StringBuilder("null<-Head:");
        DoubleNode<T> current = head;
        while (current != null) {
            txt.append("[").append(current.data).append("]");
            if (current == tail) {
                txt.append(":Tail->");
            } else {
                txt.append("=>");
            }
            current = current.next;
        }
        txt.append("null");
        return txt.toString();
    }
}
