import java.util.Scanner;
public class Vector {
    
    int[] a =new int[5];
    int indice;
    Scanner s=new Scanner(System.in);
    
    public Vector(){
        indice=0;
    }
    public void leer(){
        for(int i=0;i<5;i++){
            System.out.println("Ingrese el "+(i+1)+" numero");
            a[i]=s.nextInt();
        }
    }
    public void mostrar(){
        System.out.println("Numeros ingresados:");
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public void sumar(){
        for (int i=0;i<a.length;i++){
            indice+=a[i];
        }
        System.out.println("El resultado de la suma es: "+indice);
    }
    public static void main(String[] args) {
        Vector v =new Vector();
        v.leer();
        v.mostrar();
        v.sumar();
    }
    
}
