package main.java.uvg.edu.gt;

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