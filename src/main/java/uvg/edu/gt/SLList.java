package uvg.edu.gt;

public class SLList<T> implements UVGLList<T> {

    

    private SingleNode<T> head = null;

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public T getLast() {
        if (head == null) {
            return null;
        }

        SingleNode<T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

    @Override
    public T removeLast() {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            T removedData = head.data;
            head = null;
            return removedData;
        }

        SingleNode<T> current = head;
        SingleNode<T> previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        T removedData = current.data;
        previous.next = null;

        return removedData;
    }

    @Override
    public void addLast(T x) {
        SingleNode<T> newNode = new Node<T>(x);

        if (head == null) {
            head = newNode;
        } else {
            SingleNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public int size() {
        int count = 0;
        SingleNode<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder txt = new StringBuilder("Head:");
        SingleNode<T> x = head;
        while (x != null) {
            txt.append("[").append(x.data).append("]->");
            x = x.next;
        }
        txt.append("null");
        return txt.toString();
    }
}
