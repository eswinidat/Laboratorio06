/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author IDAT
 */
public class banco {
    
    cliente cliente1,cliente2,cliente3;

    public banco(cliente cliente1, cliente cliente2, cliente cliente3) {
        this.cliente1 = cliente1;
        this.cliente2 = cliente2;
        this.cliente3 = cliente3;
    }

    public cliente getCliente1() {
        return cliente1;
    }

    public void setCliente1(cliente cliente1) {
        this.cliente1 = cliente1;
    }

    public cliente getCliente2() {
        return cliente2;
    }

    public void setCliente2(cliente cliente2) {
        this.cliente2 = cliente2;
    }

    public cliente getCliente3() {
        return cliente3;
    }

    public void setCliente3(cliente cliente3) {
        this.cliente3 = cliente3;
    }

    @Override
    public String toString() {
        return "banco{" + "cliente1=" + cliente1 + ", cliente2=" + cliente2 + ", cliente3=" + cliente3 + '}';
    }
    public void imprimirclientes(){
        System.out.println("cliente1");
        System.out.println("cliente2");
        System.out.println("cliente3");
    }
    public void imprimirSaldoClientes(){
        double total=cliente1.getSaldo()+cliente2.getSaldo()+cliente3.getSaldo();
        System.out.println("saldo total:"+total);
    }
}
