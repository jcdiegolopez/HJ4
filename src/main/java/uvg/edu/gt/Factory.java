package uvg.edu.gt;

public class Factory {
    public static ListaEnlazada<Integer, String> createList(String type){
        switch (type){
            case "lista enlazada":
                return new StudentList();
            case "lista doble":
                return new StudentDoubleList();
            default:
                return null;
        }
    }
}
