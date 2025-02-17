/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reforsamiento.cuadrado;

/**
 *
 * @author IDAT
 */
public class cuadrado {
    private int lado;

    public cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "cuadrado{" + "lado=" + lado + '}';
    }
    public void imprimir(){
        
        //System.out.println("*****");
        for(int i=0;i<=lado;i++){
            System.out.print("*");
        }
        System.out.println("");
        
        for(int j=1;j<lado;j++){
            System.out.print("*");
            for(int k=1;k<lado - 1;k++){
                System.out.print(" ");
            }
             System.out.println("");
        }
        for(int i=0;i<=lado;i++){
            System.out.print("*");
        }
        System.out.println("*");
    }   
}
