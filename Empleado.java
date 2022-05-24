/**
 *
 * @author marcusgk
 */
public class Empleado {
    private String Nombre, Puesto,Departamento,RFC;
    
    public Empleado(String Nombre, String Puesto, String Departamento, String RFC){
        super();
        this.Nombre=Nombre;
        this.Puesto=Puesto;
        this.Departamento=Departamento;
        this.RFC=RFC;
    }
    public String getNombre(){return Nombre;}
    public String getPuesto(){return Puesto;}
    public String getDepartamento(){return Departamento;}
    public String getRFC(){return RFC;}
    //public abstract double sueldo();
}

