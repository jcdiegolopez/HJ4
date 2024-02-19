package uvg.edu.gt;

public class StudentDoubleNode implements Node<Integer, String>
{
    int keyVal = -1;
    String name = "None";
    Node<Integer, String> next = null;
    Node<Integer, String> prev = null;

    public StudentDoubleNode(int key, String cName){
        keyVal = key;
        name = cName;
    }

    public Integer getKey(){
        return new Integer(keyVal);
    }

    public String getData() {
        return name;
    }

    public Node getNext(){
        return next;
    }

    public int setNext(Node<Integer, String> x){
        next = x;
        if (x == null){
            return -1;
        }
        return 1;
    }

    public String toString(){
        String txt = "{key: " + Integer.toString(keyVal) + ", name: " + name +"}";
        return txt;
    }
}
