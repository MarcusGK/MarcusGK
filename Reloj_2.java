package com.mycompany._programasreapaso;
public class Reloj_2 {
int h;
int m;
int s;
// metodo constructor (se llama igual que la clase)
public Reloj_2() {
h = 0;
m = 0;
s = 0;
}
// Este segundo constructor acepta parametros
public Reloj_2( int h, int m, int s ) {
this.h = h;
this.m = m;
this.s = s;
}
public void visualizar2() {
System.out.println( h + ":" + m + ":" + s );
}
public void tic2() {
s++;
if ( s >= 60 ) {
s = 0;
m++;
if ( m >= 60 ) {
m = 0;
h++;
if ( h >= 12 ) {
h = 0;
}
}
}
}
public void ponerALas2( int hora, int min, int seg ) {
h = hora;
m = min;
s = seg;
}
}
