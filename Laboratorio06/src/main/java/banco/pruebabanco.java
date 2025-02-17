/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author IDAT
 */
public class pruebabanco {
    public static void main(String[] args) {
        cliente cliente1= new cliente("eswin","solano","123456","1234679",0);
        cliente cliente2= new cliente("eswin","solano","123456","1234679",0);
        cliente cliente3= new cliente("eswin","solano","123456","1234679",0);
        
        banco banco = new banco(cliente1,cliente2,cliente3);
        
        cliente1.deposito(500);
        cliente1.deposito(100);
        cliente1.deposito(2000);
        
        banco.imprimirclientes();
        cliente1.retiro(500);
        cliente1.retiro(1000);
        
        
        
    }
}
