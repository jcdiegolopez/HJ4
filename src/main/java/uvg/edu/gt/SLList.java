package uvg.edu.gt;

public class SLList<T> implements UVGLList<T> {

    private class Node<U> {
        /*
        Single Linked List Node
        No utiliza key, solo guarda data, porque no voy a hacer
        search.
         */
        public U data;
        public Node<U> next = null;

        public Node(U cData) {
            data = cData;
        }
    }

    private Node<T> head = null;

    @Override
    public boolean isEmpty() {
        return (head == null);
    }

    @Override
    public T getLast() {
        if (head == null) {
            return null;
        }

        Node<T> current = head;
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

        Node<T> current = head;
        Node<T> previous = null;

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
        Node<T> newNode = new Node<T>(x);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder txt = new StringBuilder("Head:");
        Node<T> x = head;
        while (x != null) {
            txt.append("[").append(x.data).append("]->");
            x = x.next;
        }
        txt.append("null");
        return txt.toString();
    }
}
