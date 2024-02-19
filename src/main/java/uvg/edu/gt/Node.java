package uvg.edu.gt;

public interface Node<K, T>{
    public K getKey();
    public T getData();
    public Node getNext();
    public int setNext(Node<K, T> x);
    public String toString();
}
