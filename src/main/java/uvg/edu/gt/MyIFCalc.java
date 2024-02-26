package uvg.edu.gt;

public class MyIFCalc implements INFIXCalc{
    private UVGStack<String> stack = new MyArrayStack<String>();
    
    public String toPOSFIX(String IFexpression) throws Exception{
        stack.push("#");
        String PFexpression = "";
        for (String ch : IFexpression.split("")) {
            if(isOperand(ch)){
                PFexpression+=ch;
            }else if(ch.equals("(")){
                stack.push(ch);
            }else if(ch.equals("^")){
                stack.push(ch);
            }else if(ch.equals(")")){
                while(!stack.empty() && !stack.peek().equals("(")){
                    PFexpression+=stack.pop();
                }
                stack.pop();
            }else{
                while (!stack.empty() && getPrecedence(ch) <= getPrecedence(stack.peek())) {
                    PFexpression+=stack.pop();
                }
                stack.push(ch);
            }
        }
        while (!stack.empty() && stack.peek() != "#") {
            PFexpression+=stack.pop();
        }
        return PFexpression;
    }

     /**
     * Metodo para ver si el caracter es un operando
     * @param element el elemento a evaluar
     * @return Retorna true or false
     */
    public boolean isOperand(String element) {
        return element.matches("\\d+");
    }

    public int getPrecedence(String operator) {
        switch (operator) {
            case "^":
                return 3;
            case "*":
            case "/":
                return 2;
            case "+":
            case "-":
                return 1;
            default:
                return 0; // For other characters or invalid operators
        }
    }


}
