package uvg.edu.gt;

public class DLList<T> implements UVGLList<T> {
    private class Node<U> {
        /*
        Double Linked List Node
        No utiliza key, solo guarda data, porque no voy a hacer
        search.
         */
        public U data;
        public Node<U> next = null;
        public Node<U> prev = null;

        public Node(U cData) {
            data = cData;
        }
    }

    private Node<T> head = null;
    private Node<T> tail = null;

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
        Node<T> newNode = new Node<T>(x);
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
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public String toString() {
        StringBuilder txt = new StringBuilder("null<-Head:");
        Node<T> current = head;
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
