/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany._programasreapaso;

/**
 *
 * @author marcusgk
 */
public class Pruebajelo2 {

public static void main( String[] args ) {
    // El constructor no lleva parametros
    Reloj_2 r1 = new Reloj_2();
    //Se usa el constructor con parametros
    Reloj_2 r2 = new Reloj_2( 11, 24, 59);
    r1.visualizar2();
    r1.tic2();
    r1.visualizar2();
    r2.tic2();
    r2.visualizar2();
  }
}