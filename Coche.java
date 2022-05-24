
package com.mycompany.poo;

public class Coche {
    
    private String matricula;
    private String marca;
    private String modelo;
    private int Km;
    
    public Coche(String matricula, String marca, String modelo, int Km){
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.Km=Km;
    }
    
    public int getKm(){
        return Km;
    }
    
    public void setKm(int Km){
        this.Km=Km;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    
    

    public static void main(String[] args) {
        Coche ch1 = new Coche("Anemo69","BMW","WINE-8",2600);
        Coche ch2 = new Coche("GEO18","BYD","MORA-6",6000);
        Coche ch3 = new Coche("Electro","NISSAN","Eternity-7",2000);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }
    
    @Override
    public String toString(){
        return "El coche "+modelo+" matricula: "+matricula+" de la marca "+marca+" lleva "+Km+" kilometros recorridos";
    }
}
