import java.util.Scanner;
public class Agenda {
    String nombre, direccion, telefono;
    
    Scanner s=new Scanner(System.in);
    public Agenda(){
        nombre="";
        direccion="";
        telefono="";
    }
    
    public void capnmb(){
        System.out.println("¿Cual es tu nombre?");
        nombre=s.nextLine();
    }
    
    public void capdr(){
        System.out.println("¿Cual es tu direccion?");
        direccion=s.nextLine();
    }
    
    public void captel(){
        System.out.println("¿Cual es tu telefono?");
        telefono=s.nextLine();
    }
    
    public void impr(){
        System.out.println("*******************");
        System.out.println("Nombre: "+nombre);
        System.out.println("Direccion: "+direccion);
        System.out.println("Telefono: "+telefono);
        System.out.println("********************");
        
    }

    public static void main(String[] args) {
        Agenda ag = new Agenda();
        ag.capnmb();
        ag.capdr();
        ag.captel();
        ag.impr();
        Agenda ag2 = new Agenda();
        ag2.capnmb();
        ag2.capdr();
        ag2.captel();
        ag2.impr();
    }
}