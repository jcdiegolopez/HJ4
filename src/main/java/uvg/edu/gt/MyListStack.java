package uvg.edu.gt;


/**
 * Esta clase es un stack generico
 */

public class MyListStack<E> implements UVGStack<E> {
    
    protected UVGLList<E> stack;

    public MyListStack(String type) {
        FactoryList<E> factory = new FactoryList<E>();
        stack = factory.createList(type);
    }


    @Override
    /**
     * Metodo para empujar valor al stack hasta arriba
     * @param item el valor al que se pusheara al stack
     */
    public void push(E item) {
        stack.addLast(item);
    }

    @Override
    /**
     * Metodo para sacar ultimo valor al stack
     * @return E Retorna el valor que saco del stack
     */
    public E pop() throws Exception {
        if(stack.size()>=0){
            return stack.removeLast();
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
            return stack.getLast();
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
