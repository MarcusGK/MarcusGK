package pooant;

public class ExcDemo {
    static void genException(){
        @SuppressWarnings("MismatchedReadAndWriteOfArray")
        int nums[]=new int[4];
        System.out.println("Antes de lanzar excepcion");
        nums[7]=10;
        System.out.println("Esto no se mostrara");
    }
}
class MetodosThrowable{
    public static void main(String[]args){
        try{
            ExcDemo.genException();
        }catch(ArrayIndexOutOfBoundsException exc){
            System.out.println("Mensaje estandar: ");
            System.out.println(exc);
            System.out.println("\nTraza de errores: ");
            exc.printStackTrace();
        }
        System.out.println("Despues del bloque catch.");
    }
}
