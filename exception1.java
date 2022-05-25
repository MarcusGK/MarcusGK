
package pooant;
import java.io.IOException;
public class exception1 {

    public static void main(String[] args) {
        int x, valor=100;
        try{
            for(x=0;x<100;x++){
            valor/=x;
        }
        }catch(ArithmeticException e){
            System.out.println("Error aritmetico!");
        }
        }
    }
    

