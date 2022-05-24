public class Persona {
    private String nombre, apellidos;
    private int edad;
    
    public Persona(String nombre, String apellidos, int edad){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    
    public Persona(){
    this.nombre="Raul Antonio";
    this.apellidos="Ramirez";
    this.edad=37;
    }
    
    public String getNombre(){ return nombre;}
    public String getApellidos(){return apellidos;}
    public int getEdad(){return edad;}
    public void mostrarNombreApellidoYedad(){
        System.out.println("Nombre de la Persona "+getNombre()+" "+getApellidos()+" su Edad "+getEdad());
    }
    public static void main(String[] args) {
        Persona personax=new Persona ("Sergio","Perez Sosa",33);
        personax.mostrarNombreApellidoYedad();
        Persona personay = new Persona();
        personay.mostrarNombreApellidoYedad();
        
    }
    
}