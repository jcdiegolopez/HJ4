package uvg.edu.gt;


/**
 * Interfaz de stack con generics
 */
public interface UVGStack<E>  
{

   public void push(E item);
   // post: item se agrega al stack
   
   public E pop() throws Exception;
   // post: el item de arriba es eliminado del stack
   
   public E peek() throws Exception;
   // post: retorna el valor del hasta arriba del stack
   
   public boolean empty() ;
   // post: retorna verdadero si hay elements en el stack
   
   public int size() ;
   // post: retorna el tamañol del stack

}