/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseventana;

/**
 *
 * @author IDAT
 */
public class ventanatitulo extends ventana {
    private String titulo;
    public ventanatitulo(int x, int y, int ancho, int alto, String titulo) {
        super(x, y, ancho, alto);
        this.titulo = titulo;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("titulo"+titulo);
        
    }
    public void desplazar(int dx, int dy) {

    
    
    }
}
