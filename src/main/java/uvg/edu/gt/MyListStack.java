package uvg.edu.gt;

import java.util.Scanner;

/**
 * Esta clase es un stack generico
 */

public class MyListStack<E> implements UVGStack<E> {
    
    protected UVGLList<E> stack;

    public MyListStack() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tipo de lista prefiere?");
        System.out.println("1. Single Linked List");
        System.out.println("2. Double Linked List.");
        int op = scanner.nextInt();
        String listType = "lista singularmente enlazad";
        switch(op){
            case 1:
                listType = "lista singularmente enlazada";
                break;
            case 2:
                listType = "lista doblemente enlazada";
                break;
            default:
                break;

        }
        FactoryList<E> factory = new FactoryList<E>();
        stack = factory.createList(listType);
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
