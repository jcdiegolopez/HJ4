// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package uvg.edu.gt;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner connIn = new Scanner(System.in);
        System.out.println("Que implementacion prefiere para el stack?");
        displayOptions();
        int op = connIn.nextInt();
        String stackType = "";
        switch(op){
            case 1:
                stackType = "Array List";
                break;
            case 2:
                stackType = "Vector List";
                break;
            case 3:
                stackType = "Linked List";
                break;
            default:
                System.out.println("Adios.");
        }



    }

    private static void displayOptions(){
        System.out.println("1. Array List");
        System.out.println("2. Vector List.");
        System.out.println("3. Linked List.");
        System.out.println("4. Salir.");

    }

}