import javax.swing.JOptionPane;

public class Estudiante {
    
    private String nombre, codigo;
    private double nota,nota2;
    
    public Estudiante(String nombre, String codigo, double nota, double nota2){
        this.nombre=nombre;
        this.codigo=codigo;
        this.nota=nota;
        this.nota2=nota2;
    }
    public String getnombre(){return nombre;}
    public void setnombre(String nombre){this.nombre=nombre;}
    public String getcodigo (){return codigo;}
    public void  setcodigo(String codigo){this.codigo=codigo;}
    
    
    public static void main(String[] args) {
        Estudiante est=new Estudiante("","",0.0,0.0);
        est.setnombre(JOptionPane.showInputDialog("Ingrese el nombre "));
        
    }
    
}
