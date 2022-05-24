import java.util.Scanner;
public class Multiplicacion {
    
    int n;
    Scanner s = new Scanner(System.in);
    public Multiplicacion(){// constructor
        n=0;
    }
    
    public void multi(){// metodo1
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);                                                     
        }
    }
    public void captura(){//metodo 2
        System.out.println("Ingrese el valor a multiplicar");
        n=s.nextInt();
    }
    public void titulo(){// metodo 3
        System.out.println("La tabla de "+n+" es: ");
        System.out.println("------------------");
    }
    public void tl2(){//metodo 4
        System.out.println("------------------");
    }
    public static void main(String[] args) {
        Multiplicacion mp1=new Multiplicacion();
        mp1.captura();
        mp1.titulo();
        mp1.multi();
        mp1.tl2();
    }
    
}
