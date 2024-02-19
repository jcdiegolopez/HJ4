// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package uvg.edu.gt;

import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner connIn = new Scanner(System.in);
        System.out.println("Como desea almacenar los nombres?");
        displayOptions();
        int op = connIn.nextInt();
        String listType = "";
        switch(op){
            case 1:
                listType = "lista enlazada";
                break;
            case 2:
                listType = "lista doble";
                break;
            case 3:
                listType = "Lista circular";
                break;
            default:
                System.out.println("Adios.");

        }
        System.out.println("Seleccione el tipo de patrón de diseño desea utilizar:");
        displayPatterns();
        int design = connIn.nextInt();
        ListaEnlazada<Integer, String> lista = null;
        switch(op){
            case 1:
                System.out.println("Usando un singleton");
                lista = Factory.createList(listType);
                break;
            case 2:
                 System.out.println("Usando factory.");
                 lista = SingleList.getInstance(listType).storageList;
                 // Si usan el metodo de nuevo se obtiene la misma lista.
                break;
            default:
                break;
        }

        // En cualquier caso podemos agregar y remover nombres a la lista

        System.out.println(lista);
        lista.add(123, "Uno");
        System.out.println(lista);
        lista.add(19, "Dos");
        System.out.println(lista);
        lista.add(31,"Tres");
        System.out.println(lista);
        lista.remove(31);
        System.out.println(lista);
        lista.remove(81);
        System.out.println(lista);
        System.out.println("Fin");


    }

    private static void displayOptions(){
        System.out.println("1. Lista simplemente enlazada.");
        System.out.println("2. Lista doblemente enlazada.");
        System.out.println("3. Lista circular.");
        System.out.println("4. Salir.");
        System.out.println("Seleccione su opcion.");
    }

    private static void displayPatterns(){
        System.out.println("1. Singleton.");
        System.out.println("2. Factory.");
    }
}