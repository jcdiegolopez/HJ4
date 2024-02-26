package uvg.edu.gt;

public class SingleCalc {
    private static POSFIXCalc calcInstance;

    public static synchronized POSFIXCalc getInstance(){
        if(calcInstance == null){
            calcInstance = new MyPFCalc();
            return calcInstance;
        }else{
            return calcInstance;
        }
    }
}
