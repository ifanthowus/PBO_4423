import java.io.*;
import java.util.InputMismatchException;

public class RekeningNotMatch extends RuntimeException{
    public RekeningNotMatch(String msg){
        super(msg);
    }
}
