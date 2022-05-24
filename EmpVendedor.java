import java.util.Scanner;
public class EmpVendedor extends Empleado {
    private int precioxauto,salariomin;
    private double ventast,sueldoqc;
    Scanner g=new Scanner(System.in);
    public EmpVendedor(String Nombre, String Puesto, String Departamento, String RFC ){
        super(Nombre,Puesto,Departamento,RFC);
        precioxauto=50000;
        salariomin=2500;
        sueldoqc=0.0;
        ventast=5000;
    }
    
   
    public void quincenavnd(){
        ventast=2*ventast/100;
        sueldoqc=ventast+salariomin;
        System.out.println("Nombre: "+getNombre());
        System.out.println("Puesto: "+getPuesto());
        System.out.println("Departamento: "+getDepartamento());
        System.out.println("RFC: "+getRFC());
        System.out.println("Sueldo quincenal: "+sueldoqc);
    }
    }

