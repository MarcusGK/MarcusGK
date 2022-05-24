import java.util.ArrayList;

public class Tienda {
    
    String nombre;
    String propietario;
    int IdentificadorTienda;
    static ArrayList<Computadora> computadoras=new ArrayList();
    
    public Tienda(String nombre,String propietario, int IdentificadorTienda){
        this.nombre=nombre;
        this.propietario=propietario;
        this.IdentificadorTienda=IdentificadorTienda;
        
    }
    
    public boolean tiendaLlena(){
    return false;// un vector no tiene un tamaño predefinido, nunca esta lleno, devuelve siempre false
    }
    
    public boolean tiendaVacio(){
        return computadoras.isEmpty();
        
    }
    
    public void añadir(Computadora computadora){
        computadoras.add(computadora);
    }
    
    public boolean eliminar(String marcaComputadora){
        int pos=buscar(marcaComputadora);
        if (pos<0){
            return false;
        }
        computadoras.remove(pos);
        return true;
    }
    
    public int buscar(String marcaComputadora){
        int pos;
        int posicion=computadoras.indexOf(marcaComputadora);
        if (posicion>=0){
        return posicion;
        }
        return -1;
        }
    
    public void imprimir(){
        int ArrayTamaño=computadoras.size();
        for (int i=0;i<ArrayTamaño;i++){
            System.out.println("Computadora "+i);
            Computadora computadora=(Computadora) computadoras.get(i);
            System.out.println("Marca = "+computadora.marca);
            System.out.println("Cantidad de memoria = "+computadora.cantidadMemoria);
            System.out.println("Caracteristicas del procesador = "+computadora.caracteristicasProcesador);
            System.out.println("Sistema operativo = "+computadora.sistemaOperativo);
            System.out.println("Precio = "+computadora.precio);
        }
    }
}