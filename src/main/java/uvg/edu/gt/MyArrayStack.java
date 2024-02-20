package uvg.edu.gt;
import java.util.ArrayList;

/**
 * Esta clase es un stack generico
 */

public class MyArrayStack<E> implements UVGStack<E> {
    
    protected ArrayList<E> stack = new ArrayList<E>(); 


    @Override
    /**
     * Metodo para empujar valor al stack hasta arriba
     * @param item el valor al que se pusheara al stack
     */
    public void push(E item) {
        stack.add(item);
    }

    @Override
    /**
     * Metodo para sacar ultimo valor al stack
     * @return E Retorna el valor que saco del stack
     */
    public E pop() throws Exception {
        if(stack.size()>=0){
            return stack.remove(stack.size()-1);
        }else{
            throw new Exception("Stack vacio");
        }
        
    }

    @Override
    /**
     * Metodo para mostrar el ultimo valor al stack
     * @return E Retorna el valor de hasta arriba del stack
     */
    public E peek() throws Exception {
        if(stack.size()>=0){
            return stack.get(stack.size()-1);
        }else{
            throw new Exception("Stack vacio");
        }
            
    }

    @Override
    /**
     * Metodo para verificar si el stack esta vacio
     * @return boolean Retorna true or false
     */
    public boolean empty(){
        return stack.isEmpty();
    }

    @Override
    /**
     * Metodo para ver el tamaño del stack
     * @return int Retorna el tamaño del stack
     */
    public int size(){
        return stack.size();
    }
}
