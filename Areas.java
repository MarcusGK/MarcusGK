import java.util.Scanner;
public class Areas {
    
    float rad,lado,bs,al; //variables
    String y;
    Scanner d = new Scanner(System.in);
    
    public Areas(){ //constructor
        rad=0;
        lado=0;
        bs=0;
        al=0;
    }
    public void acirculo(){ //metodo sacar area del circulo
        System.out.println("El area del circulo es: "+3.1416*Math.pow(rad,2));
    }
    public void capturacir(){ //metodo captura los datos de circulo
        System.out.println("Ingresa el radio del circulo");
        rad=d.nextFloat();
    }
    public void acuad(){ //metodo sacar area del cuadrado
        System.out.println("El area del cuadrado es: "+lado*lado);
    }
    public void caputracuad(){ //metodo captura datos del cuadrado
        System.out.println("¿Cuanto miden los lados del cuadrado?");
        lado=d.nextFloat();
    }
    public void atri(){ //metodo sacar area del triangulo
        System.out.println("El area del triangulo es: "+((bs*al)/2));
    }
    public void capturabya(){ //metodo captura de datos del triangulo y rectangulo
        System.out.println("¿Cuanto mide la base?");
        bs=d.nextFloat();
        System.out.println("¿Cuanto mide la altura?");
        al=d.nextFloat();
    }
    public void arec(){ //metodo sacar area del rectangulo
        System.out.println("El area del rectangulo es: "+bs*al);
    }
    public void selc(){ //metodo seleccionar que figura 
        System.out.println("¿Que area desea sacar?");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.println("4. Rectangulo");
        y =d.nextLine();
        switch(y){
            case "1" -> {
                capturacir();
                acirculo();
            }
            case "2" -> {
                caputracuad();
                acuad();
            }
            case "3" -> {
                capturabya();
                atri();
            }
            case "4" -> {
                capturabya();
                arec();
            }
            default -> System.out.println("No contamos con esta area");
        
        }
    }

    public static void main(String[] args) { //main
        Areas ac=new Areas();
        ac.selc();
    }
    
}
