package main.java.uvg.edu.gt;

private class DoubleNode<U> {
    /*
    Double Linked List Node
    No utiliza key, solo guarda data, porque no voy a hacer
    search.
     */
    public U data;
    public DoubleNode<U> next = null;
    public DoubleNode<U> prev = null;

    public DoubleNode(U cData) {
        data = cData;
    }
}
