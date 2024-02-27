// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
package uvg.edu.gt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            // Crear la instancia de la calculadora
            SingleCalc singleCalc = (SingleCalc) SingleCalc.getInstance();

            // Crear la instancia de la calculadora de infix a postfix
            MyIFCalc infixToPostfixCalculator = new MyIFCalc();

            // Leer el archivo de expresiones
            String fileName = "datos.txt";
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            // Procesar cada línea del archivo
            while ((line = reader.readLine()) != null) {
                // Convertir a postfix
                String postfixExpression = infixToPostfixCalculator.toPOSFIX(line);
                System.out.println("Expresión Infix: " + line);
                System.out.println("Expresión Postfix: " + postfixExpression);

                // Evaluar la expresión postfix
                int result = singleCalc.evaluate(postfixExpression);
                System.out.println("Resultado: " + result);
                System.out.println("--------------------------");
            }

            // Cerrar el lector
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

