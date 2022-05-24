import java.util.Scanner;
public class ProbarTienda {

    public static void main(String[] args) {
        Tienda tienda =new Tienda("Tienda El Baratero ","Antonio Aguilar Perez ",12345);
        Computadora computadora1=new Computadora("Acer ",50,"Intelcore7","Windows",12341);
        Computadora computadora2=new Computadora("Toshiba",80,"Intelcore 5","Windows",424223);
        Computadora computadora3=new Computadora("Mac",100,"Intelcore7","Mac",200000);
        tienda.añadir(computadora1);
        tienda.añadir(computadora2);
        tienda.añadir(computadora3);
        System.out.println("Que marca de computadora buscas: ");
        Scanner sc=new Scanner(System.in);
        String marca=sc.next();
        System.out.println("La computadora a buscar: "+marca+"se encuentra en la posicion "+tienda.buscar(marca));
        tienda.imprimir();
    }
    
}
