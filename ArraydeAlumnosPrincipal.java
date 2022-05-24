import java.util.Scanner;
public class ArraydeAlumnosPrincipal {

    public static void main(String[] args) {
        //Define la estructrura, un array de 5 alumnos
        //pero no crea objetos
        Alumno[] alum=new Alumno[5];
        //pide los datos del alumno
        System.out.println("A continuacion deberia introducir el nombre y la nota media de 5 alumnos");
        String nombreIntroducido;
        double notaIntroducida;
        Scanner Entrada = new Scanner(System.in);
        for(int i=0;i<5;i++){
            alum[i]=new Alumno();
            System.out.println("Alumno "+i);
            System.out.println("Nombre: ");
            nombreIntroducido=Entrada.nextLine();
            (alum[i]).setNombre(nombreIntroducido);
            System.out.println("Nota media: ");
            notaIntroducida=Double.parseDouble(Entrada.nextLine());
            alum[i].setNotaMedia(notaIntroducida);
        }//for i
        // Muestra los datos de los alumnos
        System.out.println("Loa datos introducidos son los siguientes:");
        double sumaDeMedias=0;
        for(int i=0; i<5;i++){
            System.out.println("Alumno "+i);
            System.out.println("Nombre: "+alum[i].getNombre());
            System.out.println("Nota media: "+alum[i].getNotaMedia());
            System.out.println("________________________");
            sumaDeMedias+=alum[i].getNotaMedia();
        }
        System.out.println("La meda global de la clase es "+sumaDeMedias/5);
    }
    
}
