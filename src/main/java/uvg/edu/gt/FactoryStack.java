package uvg.edu.gt;

public class FactoryStack<E> {
    public UVGStack<E> createStack(String type){
        switch (type){
            case "Array List":
                return new MyArrayStack<E>();
            case "Vector List":
                return new MyVectorStack<E>();
            case "Linked List":
                return new MyListStack<E>();
            default:
                return null;
        }
    }
}
