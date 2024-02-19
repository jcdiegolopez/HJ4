package uvg.edu.gt;

public class StudentList implements ListaEnlazada<Integer, String>{
    Node<Integer, String> head = null;

    public int add(Integer key, String data){
        Node<Integer, String> x = new StudentNode(key, data);
        if (head == null){
            head = x;
            return 1;
        }
        Node curr = head;
        while (curr.getNext()!=null){
            curr = curr.getNext();
        }
        curr.setNext(x);
        return 2;
    }

    public int remove(Integer key){
        Node prev = null;
        Node x = head;
        while (x!= null && !x.getKey().equals(key)){
            System.out.println(x);
            prev = x;
            x = x.getNext();
        }
        if (x == null){
            return -1; // not found
        }

        if (prev  == null){
            // x is the head
            head = x.getNext();
            return 1;
        }

        prev.setNext(x.getNext());
        return 2;
    }

    public Node<Integer, String> search(Integer key){
        Node x = head;
        while (x!= null){
            if (x.getKey().equals(key)){
                break;
            }
            x = x.getNext();
        }
        return x;
    }

    public String toString(){
        String msg = "head:";
        Node x = head;
        while (x!=null){
            msg = msg + x.toString() + "->";
            x = x.getNext();
        }
        msg = msg + "null";
        return msg;
    }

}
