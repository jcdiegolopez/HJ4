package uvg.edu.gt;
import java.util.LinkedList;

public class SingleList{
    private static SingleList instance;
    public ListaEnlazada<Integer, String> storageList;

    int op = -1;

    private SingleList(String listType) {
        switch (listType){
            case "lista enlazada":
                storageList = new StudentList();
                op = 1;
                break;
            case "lista doble":
                storageList = new StudentDoubleList();
                op = 2;
        }
    }

    public static synchronized  SingleList getInstance(String listType) {
        if (instance == null) {
            instance = new SingleList(listType);
        }
        return instance;
    }

}