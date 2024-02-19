package uvg.edu.gt;

public class StudentDoubleList implements ListaEnlazada<Integer, String>{
        Node<Integer, String> head = null;
        Node<Integer, String> tail = null;

        public int add(Integer key, String data){
            Node<Integer, String> x = new StudentDoubleNode(key, data);
            if (head == null){
                head = x;
                tail = x;
                return 1;
            }
            Node curr = tail;
            curr.setNext(x);
            tail = x;
            return 2;
        }

        public int remove(Integer key){
            return -1;
        }

        public Node<Integer, String> search(Integer key){
            return null;
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
