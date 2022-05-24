/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._programasreapaso;
public class Cuenta_2 {
public String nombre;
private double saldo;
private int numero;
public String tipo;
public void setSaldo( double s ) {
saldo = s;
}
public double getSaldo() {
return saldo;
}
public void setNumero( int num ) {
numero = num;
}
public int getNumero() {
return numero;
}
public void depositar( double deposito ) {
saldo = saldo + deposito;
}
public void retirar( double retiro ) {
if ( saldo >= retiro ) {
saldo = saldo - retiro;
}
}
public void imprimir2() {

System.out.println( "La cuenta es de: " + nombre
+ ", número: " + numero
+ ". Es una cuenta de " + tipo
+ ", con saldo: " + saldo + "\n");

}
}
