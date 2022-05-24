
package com.mycompany._programasreapaso;
public class Principal_2 {

    public static void main(String args[]) {
        
        Cuenta_2 cuentaCredito;   
        Cuenta_2 cuentaDebito;
        // Creamos los objetos
        cuentaCredito = new Cuenta_2();
        cuentaDebito = new Cuenta_2();
        cuentaCredito.nombre = "Pedro Sanchez";
        cuentaCredito.setSaldo(1500.0);
        cuentaCredito.setNumero(244513);
        cuentaCredito.tipo = "crédito";
        cuentaDebito.nombre = "Pablo Garcia";
        cuentaDebito.setSaldo(7800.0);
        cuentaDebito.setNumero(273516);
        cuentaDebito.tipo = "débito";
        cuentaCredito.imprimir2();
        cuentaDebito.imprimir2();
    }
}
