import java.util.Scanner;
public class IMC {
    double al, ps, imc;
    Scanner s=new Scanner(System.in);
    public IMC(){
        al=0;
        ps=0;
        imc=0;
    }
    public void capps(){
        System.out.println("Ingresa tu peso");
        ps=s.nextFloat();
    }
    public void capal(){
        System.out.println("Ingresa tu altura");
        al=s.nextFloat();
    }
    public void imcmstr(){
        imc=ps/Math.pow(al,2);
        System.out.println("Su Indice de masa corporal es de: "+imc);
        if(imc<=0){
            System.out.println("Ingreso los datos incorrectos");
        }
        if(imc<18.5){
            System.out.println("Se encuentra en el rango de: Bajo peso");
        }
        if(imc>=18.5&&imc<25){
            System.out.println("Se encuentra en el rango de: Peso normal");
        }
        if(imc>=25&&imc<30){
            System.out.println("Se encuentra en el rango de: Sobrepeso");
        }
        if(imc>=30){
            System.out.println("Se encuentra en el rengo de: Obesidad");
        }
    }
    public static void main(String[] args) {
        IMC masa =new IMC();
        masa.capal();
        masa.capps();
        masa.imcmstr();
    }
}
