/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseventana;

/**
 *
 * @author IDAT
 */
public class ventana {
    private int x,y, ancho , alto;
    public ventana(int x, int y, int ancho, int alto) {
    this.x = x;
    this.y = y;
    this.ancho = ancho;
    this.alto = alto;
 }
 public void mostrar() {
 System.out.println("Posición : x=" + x + ", y=" + y);
 System.out.println("Dimensiones : w=" + ancho + ", h=" + alto);
 }
 public void cambiarDimensiones(int dw, int dh) {
 ancho += dw;
 alto += dh;
 }

}
