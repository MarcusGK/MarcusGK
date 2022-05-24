import java.util.Scanner;
public class Examen {
    
    Scanner l = new Scanner(System.in);
    int cal,cor,inc,calf;
    String rs;
    
    public Examen(){
        cal=0;
        cor=0;
        inc=0;
        calf=0;
    }
    
    // Aqui empiezan los metodos de preguntas
    public void pr1(){
        System.out.println("¿Cual es la capital de Corea del norte");
        System.out.println("a) Pionyang \nb) Seul \nc) Pekin \nd) Taipéi");
        rs=l.nextLine().toLowerCase();
        switch(rs){
            case "a" -> {
                cal++;
                cor++;
            }
            case "b" -> inc++;
            case "c" -> inc++;
            case "d" -> inc++;
            default -> inc++;
        }
    }
    public void pr2(){
        System.out.println("¿Cual es la capital de Corea del sur?");
        System.out.println("a) Pionyang \nb) Seul \nc) Pekin \nd) Taipéi");
        rs=l.nextLine().toLowerCase();
        switch(rs){
            case "a" -> inc++;
            case "b" -> {
                cal++;
                cor++;
            }
            case "c" -> inc++;
            case "d" -> inc++;
            default -> inc++;
        }
    }
    public void pr3(){
        System.out.println("¿Cual es la capital de China?");
        System.out.println("a) Pionyang \nb) Seul \nc) Pekin \nd) Taipéi");
        rs=l.nextLine().toLowerCase();
        switch(rs){
            case "a" -> inc++;
            case "b" -> inc++;
            case "c" -> {
                cal++;
                cor++;
            }
            case "d" -> inc++;
            default -> inc++;
        }
    }
    public void pr4(){
        System.out.println("¿Cual es la capital de Taiwan?");
        System.out.println("a) Pionyang \nb) Seul \nc) Pekin \nd) Taipéi");
        rs=l.nextLine().toLowerCase();
        switch(rs){
            case "a" -> inc++;
            case "b" -> inc++;
            case "c" -> inc++;
            case "d" -> {
                cal++;
                cor++;
            }
            default -> inc++;
        }
    }
    public void pr5(){
        System.out.println("¿Cual es la capital de Alemania?");
        System.out.println("a) Ámsterdam \nb) Viena \nc) Berlin \nd) Estocolmo");
        rs=l.nextLine().toLowerCase();
        switch(rs){
            case "a" -> inc++;
            case "b" -> inc++;
            case "c" -> {
                cal++;
                cor++;
            }
            case "d" -> inc++;
            default -> inc++;
        }
    }
    public void pr6(){
        System.out.println("¿Cual es la capital de Suecia?");
        System.out.println("a) Ámsterdam \nb) Viena \nc) Berna \nd) Estocolmo");
        rs=l.nextLine().toLowerCase();
        switch(rs){
            case "a" -> inc++;
            case "b" -> inc++;
            case "c" -> inc++;
            case "d" -> {
                cal++;
                cor++;
            }
            default -> inc++;
        }
    }
    public void pr7(){
        System.out.println("¿Cual es la capital de Paises bajos?");
        System.out.println("a) Ámsterdam \nb) Viena \nc) Budapest \nd) Estocolmo");
        rs=l.nextLine().toLowerCase();
        switch(rs){
            case "a" -> {
                cal++;
                cor++;
            }
            case "b" -> inc++;
            case "c" -> inc++;
            case "d" -> inc++;
            default -> inc++;
        }
    }
    public void pr8(){
        System.out.println("¿Cual es la capital de Austria?");
        System.out.println("a) Ámsterdam \nb) Viena \nc) Canberra \nd) Estocolmo");
        rs=l.nextLine().toLowerCase();
        switch(rs){
            case "a" -> inc++;
            case "b" -> {
                cal++;
                cor++;
            }
            case "c" -> inc++;
            case "d" -> inc++;
            default -> inc++;
        }
    }
    public void pr9(){
        System.out.println("De estos cuatro paises, ¿Cual es el que cuenta con mayor PIB 2020-2021?");
        System.out.println("a) Italia \nb) Rusial \nc) Corea del sur \nd) Australia");
        rs=l.nextLine().toLowerCase();
        switch(rs){
            case "a" -> {
                cal++;
                cor++;
            }
            case "b" -> inc++;
            case "c" -> inc++;
            case "d" -> inc++;
            default -> inc++;
        }
    }
    public void pr10(){
        System.out.println("¿Cual es el pais con menor esperanza de vida?");
        System.out.println("a) Guinea \nb) Somalia \nc) Nigeria \nd) Togo");
        rs=l.nextLine().toLowerCase();
        switch(rs){
            case "a" -> inc++;
            case "b" -> inc++;
            case "c" -> {
                cal++;
                cor++;
            }
            case "d" -> inc++;
            default -> inc++;
        }
    }
    // aqui terminan los 10 merodos de preguntas
    
    public void calificacion(){ // Metodo muestra de calificacion
        calf=cal*10;
        System.out.println("Respuestas correctas: "+cor);
        System.out.println("Respuestas incorrectas: "+inc);
        System.out.println("Calificacion final :"+calf);
        if (calf >=70){
            System.out.println("Aprobaste");
        }else{
            System.out.println("Reprobaste");
        }
    }

    public static void main(String[] args) {
        Examen ex =new Examen();
        ex.pr1();
        ex.pr2();
        ex.pr3();
        ex.pr4();
        ex.pr5();
        ex.pr6();
        ex.pr7();
        ex.pr8();
        ex.pr9();
        ex.pr10();
        ex.calificacion();
    }
    
}
