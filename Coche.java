
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
        Coche ch1 = new Coche("matricula","marca","model",2600);
        Coche ch2 = new Coche("matricula","marca","model",2600);
        Coche ch3 = new Coche("matricula","marca","model",2600);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }
    
    @Override
    public String toString(){
        return "El coche "+modelo+" matricula: "+matricula+" de la marca "+marca+" lleva "+Km+" kilometros recorridos";
    }
}
