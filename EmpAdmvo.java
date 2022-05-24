
public class EmpAdmvo extends Empleado{
    private double msueldoadm;
    
    public EmpAdmvo(String Nombre, String Puesto, String Departamento, String RFC ){
        super(Nombre,Puesto,Departamento,RFC);
        msueldoadm=300000;
        
    }
    public void quincenaadm(){
        msueldoadm=msueldoadm/2;
        System.out.println("Nombre: "+getNombre());
        System.out.println("Puesto: "+getPuesto());
        System.out.println("Departamento: "+getDepartamento());
        System.out.println("RFC: "+getRFC());
        System.out.println("Sueldo quincenal: "+msueldoadm);
    }
    
}
