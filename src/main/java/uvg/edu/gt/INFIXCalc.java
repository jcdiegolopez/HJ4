package uvg.edu.gt;


public interface INFIXCalc {

    String toPOSFIX(String expression) throws Exception;
    boolean isOperand(String element);
    int getPrecedence(String operator);
    
}