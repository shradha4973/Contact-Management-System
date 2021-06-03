public class MyException  extends Exception{
     @Override
    public String getMessage(){
        return "invalid input";
    }
}