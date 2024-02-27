// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package uvg.edu.gt;

import java.io.BufferedReader;
import java.io.FileReader;


public class Main {
    public static void main(String[] args) {
        
        // Inicializar la calculadora utilizando el patrón Singleton
        @SuppressWarnings("unchecked")
        UVGStack<String> singleCalc = (UVGStack<String>) SingleCalc.getInstance();


        // Instanciar la clase MyIFCalc
        MyIFCalc infixToPostfixCalculator = new MyIFCalc(singleCalc);

        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Procesar cada línea del archivo como una expresión infix
                String[] expressions = line.split(" ");
                for (String infixExpression : expressions) {
                    // Convertir a expresión postfix
                    String postfixExpression = infixToPostfixCalculator.toPOSFIX(infixExpression);
                    System.out.println("Expresión postfix: " + postfixExpression);

                    // Evaluar la expresión postfix
                    int result = ((POSFIXCalc) singleCalc).evaluate(postfixExpression);
                    System.out.println("Resultado: " + result);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
