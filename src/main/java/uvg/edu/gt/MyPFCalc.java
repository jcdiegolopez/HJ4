package uvg.edu.gt;

import java.util.Scanner;

/**
 * Esta es la calculadora donde analiza la linea de string y los elementos a calcular
 */



public class MyPFCalc implements POSFIXCalc{
    UVGStack<Integer> stack;


    public MyPFCalc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que implementacion prefiere para el stack?");
        System.out.println("1. Array List");
        System.out.println("2. Vector List.");
        System.out.println("3. Linked List.");
        System.out.println("4. Salir.");
        int op = scanner.nextInt();
        String stackType;
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
                stackType = "Array List";
        }
        FactoryStack<Integer> factory = new FactoryStack<Integer>();
        stack = factory.createStack(stackType);
        
        
    }

    
     /**
     * Metodo para evaluar la expresion
     * @param expression El string o linea a evaluar 
     * @return Retorna el resultado de las operaciones validas
     */
    public int evaluate(String expression) {
        

        //Devidir en los espacios entre caracteres
        String[] elements = expression.split(" ");

        //Recorrer cada elemento y validar si es operand o operator
        for (String element : elements) {
            //Si es operado se pushea el elemento
            if (isOperand(element)) {
                stack.push(Integer.parseInt(element));
            //Si es operator significa que deben de operarse dos numeros anteriores, por lo que estos se hacen pop como elemento A y 
            // elemento B para luego operase entre ellos segun el operator indicado actualmente.
            } else if (isOperator(element)) {
                try {
                    int operandB = stack.pop();
                    int operandA = stack.pop();
                    int result = applyOperation(operandA, operandB, element);
                    stack.push(result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            return stack.pop();
        } catch (Exception e) {
            e.printStackTrace();
            return 0; // Manejar el caso en que la pila está vacía al finalizar la evaluación
        }
    }

     /**
     * Metodo para ver si el caracter es un operando
     * @param element el elemento a evaluar
     * @return Retorna true or false
     */
    public boolean isOperand(String element) {
        return element.matches("\\d+");
    }


    /**
     * Metodo para ver si el caracter es un operando
     * @param element el elemento a evaluar
     * @return Retorna true or false
     */
    public boolean isOperator(String element) {
        return element.matches("[+\\-*/]");
    }


    /**
     * Metodo para realizar la operacion
     * @param operandA Elemento A
     * @param operandB Elemento B
     * @param operator El operador
     * @return retorna el valor de la operacion
     */
    public int applyOperation(int operandA, int operandB, String operator) {
        switch (operator) {
            case "+":
                return operandA + operandB;
            case "-":
                return operandA - operandB;
            case "*":
                return operandA * operandB;
            case "/":
                return operandA / operandB;
            default:
                throw new IllegalArgumentException("Unrecognized operator: " + operator);
        }
    }
}
