
public class EmpMecanico extends Empleado {
    private int   trabajor;
    private double sueldomcn;
    
    
    public EmpMecanico(String Nombre, String Puesto, String Departamento, String RFC ){
        super(Nombre,Puesto,Departamento,RFC);
        
        sueldomcn=0;
        trabajor=5000;
    }
    public void sueldoqcmcn(){
        trabajor=trabajor*500;
        sueldomcn= 4*trabajor/100;
        System.out.println("Nombre: "+getNombre());
        System.out.println("Puesto: "+getPuesto());
        System.out.println("Departamento: "+getDepartamento());
        System.out.println("RFC: "+getRFC());
        System.out.println("Sueldo quincenal: "+sueldomcn);
    }
    
}
