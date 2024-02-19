package uvg.edu.gt;

public interface ListaEnlazada<K, T>{
    public int add(K key, T data);
    public int remove(K key);
    public Node<K, T> search(K key);
    public String toString();
}
