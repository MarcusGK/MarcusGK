
public class DeDos {
    
int iniciar;
int valor;
DeDos(){
    iniciar=0;
    valor=0;
}
public int getSiguiente() {
    valor+=2;
return valor;
}
    public void reiniciar() {
    valor=iniciar;
}
public void setComenzar(int x) {

    iniciar=x;
    valor=x;
}
}
