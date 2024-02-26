package uvg.edu.gt;

public class SingleNode<U> {
    /*
    Single Linked List Node
    No utiliza key, solo guarda data, porque no voy a hacer
    search.
     */
    public U data;
    public SingleNode<U> next = null;

    public SingleNode(U cData) {
        data = cData;
    }
}