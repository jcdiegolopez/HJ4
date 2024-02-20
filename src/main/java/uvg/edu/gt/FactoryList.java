package uvg.edu.gt;

public class FactoryList<E> {
    public UVGLList<E> createList(String type){
        switch (type){
            case "lista singularmente enlazada":
                return new SLList<E>();
            case "lista doblemente enlazada":
                return new DLList<E>();
            default:
                return null;
        }
    }
}
